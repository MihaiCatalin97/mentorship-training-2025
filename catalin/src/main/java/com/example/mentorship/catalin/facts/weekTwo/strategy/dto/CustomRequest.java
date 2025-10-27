package com.example.mentorship.catalin.facts.weekTwo.strategy.dto;

public class CustomRequest {

    private RequestType requestType;
    
    private String payload;

    public CustomRequest(RequestType requestType, String payload) {
        this.requestType = requestType;
        this.payload = payload;
    }

    public RequestType getRequestType() {
        return requestType;
    }

    public String getPayload() {
        return payload;
    }
}
