package com.elmouttaki.elmehdi.person.utils;

import com.elmouttaki.elmehdi.person.controller.enums.SchoolCodeRsp;
import com.elmouttaki.elmehdi.person.exception.SchoolError;
import com.elmouttaki.elmehdi.person.exception.SchoolErrorEnum;

import java.time.Instant;

public class SchoolRsp <T>{
    private SchoolCodeRsp code;
    private Long timestamp;
    private T data;
    private SchoolError error;

    public SchoolRsp() {
        this.timestamp = Instant.now().getEpochSecond();
    }

    public SchoolRsp(SchoolCodeRsp code) {
        this();
        this.code = code;
    }

    public SchoolRsp(SchoolCodeRsp code, T data) {
        this(code);
        this.data = data;
    }

    public SchoolRsp(SchoolCodeRsp code, SchoolErrorEnum error) {
        this(code);
        this.error = new SchoolError(error.code(), error.content(), error.message(), error.details());
    }

    public SchoolCodeRsp getCode() {
        return this.code;
    }

    public void setCode(SchoolCodeRsp code) {
        this.code = code;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public SchoolError getError() {
        return this.error;
    }

    public void setError(SchoolError error) {
        this.error = error;
    }
}
