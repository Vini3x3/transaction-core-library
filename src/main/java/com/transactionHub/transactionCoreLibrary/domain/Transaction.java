package com.transactionHub.transactionCoreLibrary.domain;

import com.transactionHub.transactionCoreLibrary.constant.AccountEnum;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Map;
import java.util.Set;

public class Transaction {
    private Date date;
    private Integer offset;
    private AccountEnum account;
    private String description;
    private BigDecimal withdrawal;
    private BigDecimal deposit;
    private BigDecimal balance;
    private Boolean virtual;
    private Set<String> tags;
    private Map<String, String> meta;

    public Transaction(Date date, Integer offset, AccountEnum account, String description, BigDecimal withdrawal, BigDecimal deposit, BigDecimal balance, Boolean virtual, Set<String> tags, Map<String, String> meta) {
        this.date = date;
        this.offset = offset;
        this.account = account;
        this.description = description;
        this.withdrawal = withdrawal;
        this.deposit = deposit;
        this.balance = balance;
        this.virtual = virtual;
        this.tags = tags;
        this.meta = meta;
    }

    public Transaction(Date date, Integer offset, AccountEnum account, String description, BigDecimal withdrawal, BigDecimal deposit, BigDecimal balance, Boolean virtual) {
        this(date, offset, account, description, withdrawal, deposit, balance, virtual, Set.of(), Map.of());
    }

    public Transaction() {
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public AccountEnum getAccount() {
        return account;
    }

    public void setAccount(AccountEnum account) {
        this.account = account;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getWithdrawal() {
        return withdrawal;
    }

    public void setWithdrawal(BigDecimal withdrawal) {
        this.withdrawal = withdrawal;
    }

    public BigDecimal getDeposit() {
        return deposit;
    }

    public void setDeposit(BigDecimal deposit) {
        this.deposit = deposit;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public Boolean getVirtual() {
        return virtual;
    }

    public void setVirtual(Boolean virtual) {
        this.virtual = virtual;
    }

    public Set<String> getTags() {
        return tags;
    }

    public void setTags(Set<String> tags) {
        this.tags = tags;
    }

    public Map<String, String> getMeta() {
        return meta;
    }

    public void setMeta(Map<String, String> meta) {
        this.meta = meta;
    }
}

