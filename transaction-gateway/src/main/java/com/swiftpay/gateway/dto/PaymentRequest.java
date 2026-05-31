package com.swiftpay.gateway.dto;

public record PaymentRequest(
    String transactionId,
    String senderId,
    String receiverId,
    Double amount,
    String currency
) {}
