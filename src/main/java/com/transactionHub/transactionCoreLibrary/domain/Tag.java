package com.transactionHub.transactionCoreLibrary.domain;

import com.transactionHub.transactionCoreLibrary.constant.TagType;

public class Tag {
    private String name;
    private String description;

    public Tag(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isSys() {
        return this.description.startsWith(TagType.SYS + ":");
    }


}
