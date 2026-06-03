package com.swiftpay.ledger.producer;

import com.swiftpay.ledger.dto.PaymentFailedEvent;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class PaymentFailedProducer {

    private final KafkaTemplate<String, Object> kafkaTemplate;

    public PaymentFailedProducer(
            KafkaTemplate<String, Object> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void publish(PaymentFailedEvent event) {

        kafkaTemplate.send(
                "payment-failed",
                event.paymentId(),
                event
        );
    }
}