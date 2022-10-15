package com.elmouttaki.elmehdi.person.controller.enums;

import com.elmouttaki.elmehdi.person.exception.SchoolEnum;

public enum SchoolCodeRsp implements SchoolEnum {

    ACCEPTED("ACCEPTED"),
    DECLINED("DECLINED"),
    ERROR("ERROR");

    private final String content;

    private SchoolCodeRsp(String content) {
        this.content = content;
    }

    public String code() {
        return this.name();
    }

    public String content() {
        return this.content;
    }
}
