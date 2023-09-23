package org.example.behavioralpatterns.chainofresponsibility;

public abstract class AuthenticationProcessor {

    public AuthenticationProcessor nextProcessor;

    public AuthenticationProcessor(AuthenticationProcessor nextProcessor) {
        this.nextProcessor = nextProcessor;
    }

    // standard constructors

    public abstract boolean isAuthorized(AuthenticationProvider authProvider);
}