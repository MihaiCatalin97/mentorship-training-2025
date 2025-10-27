package com.example.mentorship.catalin.facts.weekTwo.strategy;

import java.util.List;

import static java.util.Arrays.asList;

import com.example.mentorship.catalin.facts.weekTwo.strategy.dto.CustomRequest;
import com.example.mentorship.catalin.facts.weekTwo.strategy.dto.RequestType;
import com.example.mentorship.catalin.facts.weekTwo.strategy.handler.DefaultMessageHandler;
import com.example.mentorship.catalin.facts.weekTwo.strategy.handler.HttpMessageHandler;
import com.example.mentorship.catalin.facts.weekTwo.strategy.handler.MessageHandler;
import com.example.mentorship.catalin.facts.weekTwo.strategy.handler.RmqMessageHandler;
import com.example.mentorship.catalin.facts.weekTwo.strategy.handler.WebsocketMessageHandler;

public class Main {

    public static final String LOG_FORMAT = "I have received a %s request with the following payload: '%s'\n";

    private final static List<MessageHandler> HANDLERS = List.of(
            new HttpMessageHandler(),
            new RmqMessageHandler(),
            new WebsocketMessageHandler(),
            new DefaultMessageHandler()
    );

    public static void main(String[] args) {
        List<CustomRequest> simulatedRequests = asList(
                new CustomRequest(RequestType.HTTP, "This is a HTTP request"),
                new CustomRequest(RequestType.WEBSOCKET, "This is a WebSocket request"),
                new CustomRequest(RequestType.RMQ, "This is a RMQ request"),
                new CustomRequest(RequestType.KAFKA, "This is a Kafka request")
        );

        handleRequestsForLoop(simulatedRequests);
        handleRequestsStream(simulatedRequests);
    }

    private static void handleRequestsForLoop(List<CustomRequest> requests) {
        for (CustomRequest customRequest : requests) {
            boolean handled = false;

            for (MessageHandler messageHandler : HANDLERS) {
                if (messageHandler.canHandle(customRequest)) {
                    messageHandler.handle(customRequest);
                    handled = true;
                    break;
                }
            }

            if (!handled) {
                System.out.println("No handler found for request type: " + customRequest.getRequestType());
            }
        }
    }

    private static void handleRequestsStream(List<CustomRequest> requests) {
        requests.forEach(input -> HANDLERS.stream()
                .filter(handler -> handler.canHandle(input))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("No handler found for request type: " + input))
                .handle(input));
    }
}
