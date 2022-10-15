package com.elmouttaki.elmehdi.person.utils;

import com.elmouttaki.elmehdi.person.enums.CriteriaOperator;

public class SearchRequest {
    private String field;
    private String value;
    private CriteriaOperator operator;

    public SearchRequest() {
    }

    public String getField() {
        return this.field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public CriteriaOperator getOperator() {
        return this.operator;
    }

    public void setOperator(CriteriaOperator operator) {
        this.operator = operator;
    }

    public String toString() {
        return "SearchResponse{field='" + this.field + '\'' + ", value='" + this.value + '\'' + '}';
    }
}
