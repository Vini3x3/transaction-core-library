package com.transactionHub.transactionCoreLibrary.util;

import com.transactionHub.transactionCoreLibrary.constant.TagConstant;
import com.transactionHub.transactionCoreLibrary.constant.TagType;
import com.transactionHub.transactionCoreLibrary.domain.Tag;

public class TagPolicy {

    public static final String SYSTEM_TAG_FORMAT = "^" + TagConstant.SYS + ":.*$";
    private static final String CATEGORY_TAG_FORMAT = "^%s:%s:.*$";

    public static boolean isSystemTag(Tag tag) {
        return isSystemTag(tag.getName());
    }

    public static boolean isSystemTag(String tag) {
        return tag.matches(SYSTEM_TAG_FORMAT);
    }

    public static boolean isVirtual(Tag tag) {
        return isVirtual(tag.getName());
    }

    public static boolean isVirtual(String tag) {
        return (TagConstant.SYS + ":" + TagConstant.VIRTUAL).equals(tag);
    }

    public static boolean isCategoryTag(String tag, String category) {
        String tagFormat = String.format(CATEGORY_TAG_FORMAT, TagConstant.SYS, category);
        return isSystemTag(tag) && tag.matches(tagFormat);
    }

    public static boolean isSchedule(Tag tag) {
        return isCategoryTag(tag.getName(), TagType.SCHEDULE);
    }

    public static boolean isSchedule(String tag) {
        return isCategoryTag(tag, TagType.SCHEDULE);
    }

    public static boolean isWallet(Tag tag) {
        return isCategoryTag(tag.getName(), TagType.WALLET);
    }

    public static boolean isWallet(String tag) {
        return isCategoryTag(tag, TagType.WALLET);
    }

    public static boolean isInvest(Tag tag) {
        return isCategoryTag(tag.getName(), TagType.INVEST);
    }

    public static boolean isInvest(String tag) {
        return isCategoryTag(tag, TagType.INVEST);
    }

    public static boolean isTransfer(Tag tag) {
        return isCategoryTag(tag.getName(), TagType.TRANSFER);
    }

    public static boolean isTransfer(String tag) {
        return isCategoryTag(tag, TagType.TRANSFER);
    }

    public static boolean isLink(Tag tag) {
        return isCategoryTag(tag.getName(), TagType.LINK);
    }

    public static boolean isLink(String tag) {
        return isCategoryTag(tag, TagType.LINK);
    }

}
