package com.transactionHub.transactionCoreLibrary.domain;

import com.transactionHub.transactionCoreLibrary.constant.TagType;

import java.util.Arrays;

public class SystemTag extends Tag {

    private String category;
    private String subTag;
    public static final String[] CATEGORY = new String[] {
            TagType.INVEST,
            TagType.SCHEDULE,
            TagType.WALLET
    };

    public SystemTag(String name, String description) {
        super(name, description);
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("invalid tag format: tag is null or blank");
        }
        String[] tagParts = name.split(":");
        if (tagParts.length != 3) {
            throw new IllegalArgumentException("invalid tag format: not composed of 3 parts");
        }
        if (!tagParts[0].equals(TagType.SYS)) {
            throw new IllegalArgumentException("invalid tag format: not system tag");
        }
        if (Arrays.stream(CATEGORY).noneMatch(o -> o.equals(tagParts[1]))) {
            throw new IllegalArgumentException("invalid tag format: invalid category");
        }
        this.category = tagParts[1];
        this.subTag = tagParts[2];
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSubTag() {
        return subTag;
    }

    public void setSubTag(String subTag) {
        this.subTag = subTag;
    }
}
