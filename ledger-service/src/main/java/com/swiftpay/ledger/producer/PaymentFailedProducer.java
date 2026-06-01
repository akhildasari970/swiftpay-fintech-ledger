package com.swiftpay.ledger.producer;

import com.swiftpay.ledger.dto.PaymentFailedEvent;

public class PaymentFailedProducer {

    public void publish(PaymentFailedEvent event) {
        System.out.println("Publishing failed event: " + event.paymentId());
    }
}
