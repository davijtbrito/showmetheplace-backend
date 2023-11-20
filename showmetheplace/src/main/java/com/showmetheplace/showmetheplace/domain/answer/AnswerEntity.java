package com.showmetheplace.showmetheplace.domain.answer;

import java.time.LocalDateTime;

import com.showmetheplace.showmetheplace.design.abstracts.BaseEntity;
import com.showmetheplace.showmetheplace.domain.call.CallEntity;
import com.showmetheplace.showmetheplace.domain.helper.HelperEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
@Table(name = "answer")
public class AnswerEntity extends BaseEntity {
    
    @OneToOne
    private CallEntity call;

    @OneToOne
    private HelperEntity helper;

    public AnswerEntity(CallEntity call, HelperEntity helper) {
        this.id = null;
        this.call = call;
        this.helper = helper;
        this.active = true;
        this.dateCreated = LocalDateTime.now();
        this.dateUpdated = LocalDateTime.now();
    }

    public AnswerEntity(Long id, CallEntity call, HelperEntity helper, boolean isActive, LocalDateTime dateCreated, LocalDateTime dateUpdated) {
        this.id = id;
        this.call = call;
        this.helper = helper;
        this.active = isActive;
        this.dateCreated = dateCreated;
        this.dateUpdated = dateUpdated;
    }

    
}
