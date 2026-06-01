package com.swiftpay.analytics.dto;

public record HealthMetrics(
        long totalEvents,
        long failedEvents,
        double tps,
        long kafkaLag
) {}
