package com.swiftpay.ledger.producer;

public class DLQProducer {

    public void publish(String paymentId) {
        System.out.println("Publishing to DLQ: " + paymentId);
    }
}
