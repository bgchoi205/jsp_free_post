package com.choi.jsp_exam.fishRecommend.dao;

import com.choi.jsp_exam.fishRecommend.domain.Fish;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface FishRepository extends JpaRepository<Fish, Long> {
    Optional<Fish> findByName(String name);
}
