package com.example.mentorship.catalin.facts.weekTwo.strategy.handler;

import com.example.mentorship.catalin.facts.weekTwo.strategy.dto.CustomRequest;

public interface MessageHandler {

    boolean canHandle(CustomRequest customRequest);

    void handle(CustomRequest customRequest);

}
