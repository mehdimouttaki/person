package com.elmouttaki.elmehdi.person.enums;

import com.elmouttaki.elmehdi.person.exception.SchoolErrorEnum;

public enum SchoolCommonBusinessError implements SchoolErrorEnum {

    SCBE00001SCHOOL_COMMON_BUSINESS_ERROR("TEACHER_NOT_FOUND", "There is no teacher with the id");

    SchoolCommonBusinessError(String teacher_not_found, String s) {
    }

    @Override
    public String code() {
        return null;
    }

    @Override
    public String content() {
        return null;
    }

    @Override
    public String message() {
        return null;
    }
}
