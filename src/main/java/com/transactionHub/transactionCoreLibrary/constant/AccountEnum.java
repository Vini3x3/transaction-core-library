package com.transactionHub.transactionCoreLibrary.constant;

public enum AccountEnum {

    FORMAL(1),
    BRANCH(2),
    CITI(3),
    BOC(4);

    private final int id;

    AccountEnum(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

}
