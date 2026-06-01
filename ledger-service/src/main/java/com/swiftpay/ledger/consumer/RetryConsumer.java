package com.swiftpay.ledger.consumer;

public class RetryConsumer {

    public void retry(String paymentId) {
        System.out.println("Retrying payment: " + paymentId);
    }
}
