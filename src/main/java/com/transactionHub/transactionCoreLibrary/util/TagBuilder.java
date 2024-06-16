package com.transactionHub.transactionCoreLibrary.util;

import com.transactionHub.transactionCoreLibrary.constant.TagType;

public class TagBuilder {

    private boolean isSys;
    private boolean isSchedule;
    private boolean isInvest;
    private String name;
    private Integer offset;

    private TagBuilder() {}

    public static TagBuilder newTag()
    {
        return new TagBuilder();
    }

    public TagBuilder isSys()
    {
        isSys = true;
        return this;
    }

    public TagBuilder isSchedule()
    {
        this.isSchedule = true;
        this.isSys = true;
        return this;
    }

    public TagBuilder isInvest()
    {
        this.isInvest = true;
        this.isSys = true;
        return this;
    }

    public TagBuilder name(String name) {
        this.name = name;
        return this;
    }

    public TagBuilder offset(int offset)
    {
        this.offset = offset;
        return this;
    }

    public String build()
    {

        if (this.name == null || this.name.isBlank()) {
            throw new RuntimeException("Invalid Tag Setting");
        }

        StringBuffer sb = new StringBuffer();
        if (isSys) {
            sb.append(TagType.SYS);
            sb.append(":");
        }
        if (isSchedule) {
            sb.append(TagType.SCHEDULE);
            sb.append(":");
        }
        if (isInvest) {
            sb.append(TagType.INVEST);
            sb.append(":");
        }

        sb.append(name);

        if (offset != null) {
            sb.append("-");
            sb.append(offset);
        }

        return sb.toString();
    }




}
