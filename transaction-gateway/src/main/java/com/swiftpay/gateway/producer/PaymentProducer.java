package com.swiftpay.gateway.producer;

import com.swiftpay.gateway.dto.PaymentInitiatedEvent;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PaymentProducer {

    private final KafkaTemplate<String, PaymentInitiatedEvent> kafkaTemplate;

    public void publish(PaymentInitiatedEvent event) {
        kafkaTemplate.send(
                "payment-initiated",
                event.paymentId(),
                event
        );
    }
}
