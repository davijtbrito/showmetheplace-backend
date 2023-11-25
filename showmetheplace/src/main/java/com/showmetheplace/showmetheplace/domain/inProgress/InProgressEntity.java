package com.showmetheplace.showmetheplace.domain.inProgress;

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
@Table(name = "inProgress")
public class InProgressEntity extends BaseEntity {
    
    @OneToOne
    private CallEntity call;

    @OneToOne
    private HelperEntity helper;

    public InProgressEntity(CallEntity call, HelperEntity helper) {
        this.id = null;        
        this.call = call;
        this.helper = helper;
        this.active = true;        
        this.dateCreated = LocalDateTime.now();
        this.dateUpdated = LocalDateTime.now();
    }    

    public InProgressEntity(Long id, CallEntity call, HelperEntity helper, boolean isActive, LocalDateTime date_created, LocalDateTime date_updated) {
        this.id = id;        
        this.active = isActive;
        this.call = call;
        this.helper = helper;        
        this.dateCreated = date_created;
        this.dateUpdated = date_updated;
    }    
}
