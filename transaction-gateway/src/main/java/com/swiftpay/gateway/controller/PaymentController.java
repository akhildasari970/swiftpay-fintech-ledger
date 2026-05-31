package com.swiftpay.gateway.controller;

import com.swiftpay.gateway.dto.PaymentRequest;
import com.swiftpay.gateway.dto.PaymentResponse;
import com.swiftpay.gateway.service.PaymentService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/payments")
public class PaymentController {

    private final PaymentService paymentService = new PaymentService();

    @PostMapping
    public PaymentResponse createPayment(@RequestBody PaymentRequest request) {
        return paymentService.createPayment(request);
    }
}
