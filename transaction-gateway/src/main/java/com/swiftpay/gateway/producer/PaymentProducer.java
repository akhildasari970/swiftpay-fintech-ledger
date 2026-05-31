package com.swiftpay.gateway.producer;

import com.swiftpay.gateway.dto.PaymentInitiatedEvent;

public class PaymentProducer {

    public void publish(PaymentInitiatedEvent event) {
        System.out.println("Publishing payment event: " + event.paymentId());
    }
}
