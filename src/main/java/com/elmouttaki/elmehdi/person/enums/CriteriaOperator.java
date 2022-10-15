package com.elmouttaki.elmehdi.person.enums;

import com.elmouttaki.elmehdi.person.exception.SchoolEnum;

public enum CriteriaOperator implements SchoolEnum {
    GREATER_THAN("GREATER_THAN"),
    LESS_THAN("LESS_THAN"),
    GREATER_THAN_EQUAL("GREATER_THAN_EQUAL"),
    LESS_THAN_EQUAL("LESS_THAN_EQUAL"),
    NOT_EQUAL("NOT_EQUAL"),
    EQUAL("EQUAL"),
    MATCH("MATCH"),
    MATCH_END("MATCH_END"),
    MATCH_FIRST("MATCH_FIRST"),
    IN("IN"),
    NOT_IN("NOT_IN"),
    BETWEEN("BETWEEN"),
    IS_NULL("IS_NULL"),
    IS_NOT_NULL("IS_NOT_NULL");

    private final String content;

    private CriteriaOperator(String content) {
        this.content = content;
    }

    public String code() {
        return this.name();
    }

    public String content() {
        return this.content;
    }
}
