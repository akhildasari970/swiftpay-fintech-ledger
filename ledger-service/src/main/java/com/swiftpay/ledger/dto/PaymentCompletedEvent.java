package com.swiftpay.ledger.dto;

public record PaymentCompletedEvent(
        String paymentId,
        String status
) {}
