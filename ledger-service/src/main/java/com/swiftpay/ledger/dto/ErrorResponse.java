package com.swiftpay.ledger.dto;

public record ErrorResponse(
        String errorCode,
        String message
) {}
