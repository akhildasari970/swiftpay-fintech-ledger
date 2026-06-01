package com.swiftpay.ledger.dto;

import java.util.List;

public record TransactionHistoryResponse(
        String userId,
        List<String> transactions
) {}
