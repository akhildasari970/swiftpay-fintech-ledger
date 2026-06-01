package com.swiftpay.analytics.consumer;

public class PaymentCompletedConsumer {

    public void consume(String paymentId) {
        System.out.println("Consumed completed payment: " + paymentId);
    }
}
