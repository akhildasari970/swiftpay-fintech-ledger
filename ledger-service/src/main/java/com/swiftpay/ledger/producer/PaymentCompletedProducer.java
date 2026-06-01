package com.swiftpay.ledger.producer;

import com.swiftpay.ledger.dto.PaymentCompletedEvent;

public class PaymentCompletedProducer {

    public void publish(PaymentCompletedEvent event) {
        System.out.println("Publishing completed event: " + event.paymentId());
    }
}
