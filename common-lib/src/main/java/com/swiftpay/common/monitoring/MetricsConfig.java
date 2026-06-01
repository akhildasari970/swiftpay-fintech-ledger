package com.swiftpay.common.monitoring;

public class MetricsConfig {

    public String metricsEndpoint() {
        return "/actuator/prometheus";
    }
}
