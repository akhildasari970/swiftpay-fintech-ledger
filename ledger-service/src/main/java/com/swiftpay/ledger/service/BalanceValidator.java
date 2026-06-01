package com.swiftpay.ledger.service;

public class BalanceValidator {

    public boolean hasSufficientBalance(Double balance, Double amount) {
        return balance >= amount;
    }
}
