package com.example.mentorship.catalin.facts.weekTwo.strategy.handler;

import com.example.mentorship.catalin.facts.weekTwo.strategy.dto.CustomRequest;
import com.example.mentorship.catalin.facts.weekTwo.strategy.dto.RequestType;

public abstract class AbstractMessageHandler implements MessageHandler {

    @Override
    public boolean canHandle(final CustomRequest customRequest) {
        return getRequestType().equals(customRequest.getRequestType());
    }

    protected abstract RequestType getRequestType();
}
