package com.showmetheplace.showmetheplace.domain.answer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface AnswerRepository extends JpaRepository<AnswerEntity, Long> {
        
    @Query("SELECT a FROM AnswerEntity a WHERE a.helper.id = :helperId AND a.active = true")
    AnswerEntity findByHelperId(Long helperId);
}
