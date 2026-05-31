package com.swiftpay.gateway.service;

public class IdempotencyService {

    public boolean isDuplicate(String transactionId) {
        return false;
    }
}
