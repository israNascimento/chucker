package com.readystatesoftware.chuck.internal.data;

import com.readystatesoftware.chuck.internal.support.FormatUtils;

import java.util.Date;

import nl.qbusict.cupboard.annotation.Index;

/**
 * @author Olivier Perez
 */
public class RecordedThrowable {

    private Long _id;

    @Index
    private Date date;

    private String clazz;

    private String message;

    private String content;

    public RecordedThrowable(Throwable throwable) {
        date = new Date();
        clazz = throwable.getClass().getName();
        message = throwable.getMessage();
        content = FormatUtils.formatThrowable(throwable);
    }

    public Date getDate() {
        return date;
    }

    public RecordedThrowable setDate(Date date) {
        this.date = date;
        return this;
    }

    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    public String getMessage() {
        return message;
    }

    public RecordedThrowable setMessage(String message) {
        this.message = message;
        return this;
    }

    public Long getId() {
        return _id;
    }

    public RecordedThrowable setId(Long _id) {
        this._id = _id;
        return this;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
