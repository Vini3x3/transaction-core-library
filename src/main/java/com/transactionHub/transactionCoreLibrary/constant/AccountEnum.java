package com.transactionHub.transactionCoreLibrary.constant;

public enum AccountEnum {

    HSBC(1),
    HSBC_SAVE(2),
    CITI(3),
    BOC(4),
    BOC_CHINA(5);

    private final int id;

    AccountEnum(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

}
