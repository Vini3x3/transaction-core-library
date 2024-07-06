package com.transactionHub.transactionCoreLibrary.domain;

import com.transactionHub.transactionCoreLibrary.constant.AccountEnum;
import org.joda.time.DateTime;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Transaction implements Comparable<Transaction> {
    private DateTime date;
    private Integer offset;
    private AccountEnum account;
    private String description;
    private BigDecimal withdrawal;
    private BigDecimal deposit;
    private BigDecimal balance;
    private Set<String> tags;
    private Map<String, String> meta;
    private List<FileInfo> attachments;

    public Transaction(DateTime date, Integer offset, AccountEnum account, String description, BigDecimal withdrawal, BigDecimal deposit, BigDecimal balance, Set<String> tags, Map<String, String> meta, List<FileInfo> attachments) {
        this.date = date;
        this.offset = offset;
        this.account = account;
        this.description = description;
        this.withdrawal = withdrawal;
        this.deposit = deposit;
        this.balance = balance;
        this.tags = tags;
        this.meta = meta;
        this.attachments = attachments;
    }

    public Transaction(DateTime date, Integer offset, AccountEnum account, String description, BigDecimal withdrawal, BigDecimal deposit, BigDecimal balance) {
        this(date, offset, account, description, withdrawal, deposit, balance, Set.of(), Map.of(), List.of());
    }

    public Transaction() {
    }

    public DateTime getDate() {
        return date;
    }

    public void setDate(DateTime date) {
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

    public List<FileInfo> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<FileInfo> attachments) {
        this.attachments = attachments;
    }

    @Override
    public int compareTo(Transaction o) {
        if (this.date.compareTo(o.date) != 0) {
            return this.date.compareTo(o.date);
        }
        if ((int) this.offset != o.offset) {
            return Integer.compare(this.offset, o.offset);
        }
        return this.account.compareTo(o.account);
    }
}

