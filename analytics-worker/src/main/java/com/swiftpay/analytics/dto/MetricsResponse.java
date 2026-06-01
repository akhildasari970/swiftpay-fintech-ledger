package com.swiftpay.analytics.dto;

public record MetricsResponse(
        Long totalTransactions,
        Double totalVolume,
        Long successCount,
        Long failureCount
) {}
