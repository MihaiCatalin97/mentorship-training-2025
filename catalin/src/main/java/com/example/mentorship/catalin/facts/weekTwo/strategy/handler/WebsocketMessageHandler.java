package com.example.mentorship.catalin.facts.weekTwo.strategy.handler;

import com.example.mentorship.catalin.facts.weekTwo.strategy.dto.CustomRequest;
import com.example.mentorship.catalin.facts.weekTwo.strategy.dto.RequestType;

import static com.example.mentorship.catalin.facts.weekTwo.strategy.Main.LOG_FORMAT;

public class WebsocketMessageHandler extends AbstractMessageHandler {

    @Override
    public void handle(final CustomRequest customRequest) {
        System.out.println("Handling WebSocket request...");
        System.out.println(String.format(LOG_FORMAT, customRequest.getRequestType(), customRequest.getPayload()));
     }

    @Override
    protected RequestType getRequestType() {
        return RequestType.WEBSOCKET;
    }
}
