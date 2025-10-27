package com.example.mentorship.catalin.facts.weekTwo.strategy.handler;

import com.example.mentorship.catalin.facts.weekTwo.strategy.dto.CustomRequest;

public class DefaultMessageHandler implements MessageHandler {

    @Override
    public boolean canHandle(final CustomRequest customRequest) {
        return true;
    }

    @Override
    public void handle(final CustomRequest customRequest) {
        System.out.println("Could not find a suitable handler for the request...");
    }
}
