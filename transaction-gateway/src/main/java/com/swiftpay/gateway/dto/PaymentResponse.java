package com.swiftpay.gateway.dto;

public record PaymentResponse(
    String paymentId,
    String status
) {}
