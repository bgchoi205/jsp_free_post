package com.choi.jsp_exam.global.enumeration.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ExceptionMessage {

    DUPLICATENAME("이미 등록된 이름입니다."),
    NOFISHBYID("해당 id Fish는 존재하지 않습니다.");

    private String value;
}
