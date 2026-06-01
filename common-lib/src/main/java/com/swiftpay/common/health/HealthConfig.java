package com.swiftpay.common.health;

public class HealthConfig {

    public boolean liveness() {
        return true;
    }

    public boolean readiness() {
        return true;
    }
}
