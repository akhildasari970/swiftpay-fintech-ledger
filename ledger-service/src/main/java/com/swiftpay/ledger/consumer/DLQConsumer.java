package com.swiftpay.ledger.consumer;

public class DLQConsumer {

    public void consume(String paymentId) {
        System.out.println("DLQ processing payment: " + paymentId);
    }
}
