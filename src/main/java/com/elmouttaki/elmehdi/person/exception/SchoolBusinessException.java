package com.elmouttaki.elmehdi.person.exception;

import java.util.List;

public class SchoolBusinessException extends SchoolException {
    private SchoolErrorEnum error;

    public SchoolBusinessException(SchoolErrorEnum error) {
        super(error.content());
        this.error = error;
    }

    public SchoolBusinessException(SchoolErrorEnum error, List<String> params) {
        super(error.content(), params);
        this.error = error;
    }

    public SchoolErrorEnum getError() {
        return this.error;
    }

    public void setError(SchoolErrorEnum error) {
        this.error = error;
    }
}
