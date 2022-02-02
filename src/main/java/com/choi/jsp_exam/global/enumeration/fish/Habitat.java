package com.choi.jsp_exam.global.enumeration.fish;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Habitat {

    WESTSEA("서해"),
    EASTSEA("동해"),
    SOUTHSEA("남해");

    private String value;
}
