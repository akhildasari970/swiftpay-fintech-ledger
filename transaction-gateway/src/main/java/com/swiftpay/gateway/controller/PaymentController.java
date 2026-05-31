package com.swiftpay.gateway.controller;

import com.swiftpay.gateway.dto.PaymentRequest;
import com.swiftpay.gateway.dto.PaymentResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/payments")
public class PaymentController {

    @PostMapping
    public PaymentResponse createPayment(@RequestBody PaymentRequest request) {
        return new PaymentResponse("demo-payment-id", "PENDING");
    }
}
