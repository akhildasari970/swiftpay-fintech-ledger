package com.swiftpay.common.logging;

public class RequestLoggingFilter {

    public void log(String requestId, String endpoint) {
        System.out.println("RequestId=" + requestId + ", endpoint=" + endpoint);
    }
}
