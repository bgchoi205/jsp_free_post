package com.choi.jsp_exam.fish;

import com.choi.jsp_exam.fishRecommend.domain.Fish;
import com.choi.jsp_exam.fishRecommend.dto.FishSaveDto;
import com.choi.jsp_exam.fishRecommend.service.FishService;
import com.choi.jsp_exam.global.enumeration.fish.CookingStyle;
import com.choi.jsp_exam.global.enumeration.fish.Habitat;
import com.choi.jsp_exam.global.enumeration.fish.Season;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

@SpringBootTest
@Transactional
public class FishServiceTest {

    @Autowired
    private FishService fishService;

    @Test
    public void saveTest(){

        Collection<Habitat> dolHabitats = Arrays.asList(Habitat.SOUTHSEA, Habitat.WESTSEA, Habitat.EASTSEA);
        Collection<Habitat> gamHabitats = Arrays.asList(Habitat.SOUTHSEA, Habitat.WESTSEA, Habitat.EASTSEA);

        Collection<CookingStyle> cooks = Arrays.asList(CookingStyle.SASHIMI, CookingStyle.SOUP);


        FishSaveDto fishSaveDto = new FishSaveDto("돌돔", Season.FALL, dolHabitats, cooks, "비싸고 귀합니다.");
        FishSaveDto fishSaveDto2 = new FishSaveDto("감성돔", Season.WINTER, gamHabitats,  cooks,  "겨울 감성돔이 제철, 바다의 왕자");

        fishService.save(fishSaveDto);
        fishService.save(fishSaveDto2);

        Fish fish = fishService.findById(1L);

        Assertions.assertTrue(fishSaveDto.getName().equals(fish.getName()));

        FishSaveDto fishSaveDto3 = new FishSaveDto("감성돔", Season.WINTER, gamHabitats,  cooks,"겨울 감성돔이 제철, 바다의 왕자");

        Assertions.assertThrows(
                DuplicateKeyException.class,
                ()-> fishService.save(fishSaveDto3)
        );

    }

}
