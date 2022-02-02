package com.choi.jsp_exam.global.enumeration.fish;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum CookingStyle {

    GRILL("구이"),
    SASHIMI("회"),
    SOUP("탕");

    private String value;
}
