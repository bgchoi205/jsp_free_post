package com.choi.jsp_exam.fishRecommend.domain;

import com.choi.jsp_exam.global.enumeration.fish.CookingStyle;
import com.choi.jsp_exam.global.enumeration.fish.Habitat;
import com.choi.jsp_exam.global.enumeration.fish.Season;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Getter
@NoArgsConstructor
public class Fish {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "season")
    private Season season;

    @ElementCollection
    @Column(name = "habitat")
    private Collection<Habitat> habitats;

    @ElementCollection
    @Column(name = "cookingStyle")
    private Collection<CookingStyle> cookingStyles;

    @Column(name = "description")
    private String description;

    @Builder
    public Fish(String name, Season season, Collection<Habitat> habitats, Collection<CookingStyle> cookingStyles, String description){
        this.name = name;
        this.season = season;
        this.habitats = habitats;
        this.cookingStyles = cookingStyles;
        this.description = description;
    }

}
