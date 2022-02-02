package com.choi.jsp_exam.fishRecommend.service;

import com.choi.jsp_exam.fishRecommend.dao.FishRepository;
import com.choi.jsp_exam.fishRecommend.domain.Fish;
import com.choi.jsp_exam.fishRecommend.dto.FishSaveDto;
import com.choi.jsp_exam.global.enumeration.exception.ExceptionMessage;
import lombok.RequiredArgsConstructor;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class FishService {

    private final FishRepository fishRepository;

    @Transactional
    public void save(FishSaveDto fishSaveDto){

        fishNameCheck(fishSaveDto.getName());



        Fish fish = Fish.builder()
                .name(fishSaveDto.getName())
                .season(fishSaveDto.getSeason())
                .habitats(fishSaveDto.getHabitats())
                .cookingStyles(fishSaveDto.getCookingStyles())
                .description(fishSaveDto.getDescription())
                .build();

        fishRepository.save(fish);
    }

    public Fish findById(Long id){
        return fishRepository.findById(id).orElseThrow(()->new NoSuchElementException(ExceptionMessage.NOFISHBYID.getValue()));
    }

    private void fishNameCheck(String name) {

        if(!fishRepository.findByName(name).isEmpty()){
            throw new DuplicateKeyException(ExceptionMessage.DUPLICATENAME.getValue());
        }
    }

}
