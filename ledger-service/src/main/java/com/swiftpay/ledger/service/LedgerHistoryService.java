package com.swiftpay.ledger.service;

import com.swiftpay.ledger.dto.TransactionHistoryResponse;
import java.util.List;

public class LedgerHistoryService {

    public TransactionHistoryResponse getHistory(String userId) {
        return new TransactionHistoryResponse(
                userId,
                List.of("TXN-1001", "TXN-1002")
        );
    }
}
