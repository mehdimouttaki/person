package com.elmouttaki.elmehdi.person.exception;

import java.util.HashMap;
import java.util.Map;

public interface SchoolErrorEnum extends SchoolEnum {
    String message();

    default Map<String, String> details() {
        return new HashMap();
    }
}
