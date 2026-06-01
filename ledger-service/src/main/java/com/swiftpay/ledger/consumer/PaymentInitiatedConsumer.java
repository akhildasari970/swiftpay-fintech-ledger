package com.swiftpay.ledger.consumer;

public class PaymentInitiatedConsumer {
    public void consume(String event) {
        System.out.println("Consumed payment event: " + event);
    }
}
