package com.choi.jsp_exam.fishRecommend.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.persistence.Column;

@Getter
@AllArgsConstructor
public class FishSaveDto {

    private String name;

    private String season;

    private String cookingStyle;

    private String description;
}
