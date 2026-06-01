package com.swiftpay.ledger.controller;

import com.swiftpay.ledger.dto.TransactionHistoryResponse;
import com.swiftpay.ledger.service.LedgerHistoryService;

public class LedgerController {

    private final LedgerHistoryService ledgerHistoryService = new LedgerHistoryService();

    public TransactionHistoryResponse getHistory(String userId) {
        return ledgerHistoryService.getHistory(userId);
    }
}
