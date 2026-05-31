package com.swiftpay.gateway.dto;

public record PaymentInitiatedEvent(
        String paymentId,
        String senderId,
        String receiverId,
        Double amount
) {}
