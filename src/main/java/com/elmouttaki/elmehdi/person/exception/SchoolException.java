package com.elmouttaki.elmehdi.person.exception;

import java.util.List;

public class SchoolException extends RuntimeException{

    private List<String> params;

    public SchoolException() {
    }

    public SchoolException(String message) {
        super(message);
    }

    public SchoolException(String message, List<String> params) {
        this(message);
        this.params = params;
    }

    public List<String> getParams() {
        return this.params;
    }

    public void setParams(List<String> params) {
        this.params = params;
    }
}
