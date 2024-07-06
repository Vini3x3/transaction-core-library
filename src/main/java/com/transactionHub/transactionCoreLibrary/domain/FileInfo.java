package com.transactionHub.transactionCoreLibrary.domain;

import java.util.Date;

public class FileInfo {
    private String filename;
    private Date updateDate;
    private String fileId;

    public FileInfo() {
    }

    public FileInfo(String filename, Date updateDate, String fileId) {
        this.filename = filename;
        this.updateDate = updateDate;
        this.fileId = fileId;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

}
