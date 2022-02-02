package com.choi.jsp_exam.fishRecommend.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

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
    private String season;

    @Column(name = "cookingStyle")
    private String cookingStyle;

    @Column(name = "description")
    private String description;

    @Builder
    public Fish(String name, String season, String cookingStyle, String description){
        this.name = name;
        this.season = season;
        this.cookingStyle = cookingStyle;
        this.description = description;
    }

}
