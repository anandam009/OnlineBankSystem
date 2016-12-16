package com.userfront.domain;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by vbilenko on 12/15/16.
 */
public class SavingAccount {

    private Long id;
    private int accountNumber;
    private BigDecimal accountBalance;

    private List<SavingTransaction> savingTransactionList;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public BigDecimal getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(BigDecimal accountBalance) {
        this.accountBalance = accountBalance;
    }

    public List<SavingTransaction> getSavingTransactionList() {
        return savingTransactionList;
    }

    public void setSavingTransactionList(List<SavingTransaction> savingTransactionList) {
        this.savingTransactionList = savingTransactionList;
    }
}
