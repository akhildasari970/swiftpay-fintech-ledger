package com.swiftpay.ledger.producer;

import com.swiftpay.ledger.dto.PaymentCompletedEvent;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class PaymentCompletedProducer {

    private final KafkaTemplate<String, Object> kafkaTemplate;

    public PaymentCompletedProducer(
            KafkaTemplate<String, Object> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void publish(PaymentCompletedEvent event) {

        kafkaTemplate.send(
                "payment-completed",
                event.paymentId(),
                event
        );
    }
}