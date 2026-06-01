package com.swiftpay.ledger.service;

public class PaymentProcessor {

    private final BalanceValidator balanceValidator = new BalanceValidator();

    public boolean process(Double balance, Double amount) {
        return balanceValidator.hasSufficientBalance(balance, amount);
    }
}
