package com.choi.jsp_exam.fishRecommend.dto;

import com.choi.jsp_exam.global.enumeration.fish.CookingStyle;
import com.choi.jsp_exam.global.enumeration.fish.Habitat;
import com.choi.jsp_exam.global.enumeration.fish.Season;
import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.persistence.Column;
import java.util.Collection;

@Getter
@AllArgsConstructor
public class FishSaveDto {

    private String name;

    private Season season;

    private Collection<Habitat> habitats;

    private Collection<CookingStyle> cookingStyles;

    private String description;
}
