package com.swiftpay.gateway.service;

import com.swiftpay.gateway.dto.PaymentRequest;
import com.swiftpay.gateway.dto.PaymentResponse;

public class PaymentService {
    public PaymentResponse createPayment(PaymentRequest request) {
        return new PaymentResponse(java.util.UUID.randomUUID().toString(), "PENDING");
    }
}
