package com.swiftpay.analytics.dto;

public record AnalyticsResponse(
        String paymentId,
        String status,
        Double amount
) {}
