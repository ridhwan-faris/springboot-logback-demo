package com.ridhwan.logbackdemo.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ResponseCode {
    SUCCESS("00","Success");

    private String code;
    private String message;
}
