package com.swiftpay.ledger.dto;

public record PaymentFailedEvent(
        String paymentId,
        String reason
) {}
