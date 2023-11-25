package com.showmetheplace.showmetheplace.domain.schedule;

import java.time.LocalDateTime;

import com.showmetheplace.showmetheplace.design.abstracts.BaseEntity;
import com.showmetheplace.showmetheplace.domain.customer.CustomerEntity;
import com.showmetheplace.showmetheplace.domain.helper.HelperEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
@Table(name = "schedule")
public class ScheduleEntity extends BaseEntity {
    
    @OneToOne
    private CustomerEntity customer;

    @OneToOne
    private HelperEntity helper;

    /**
     * Date that were shceduled by the customer and accepted by the helper.
     */
    private LocalDateTime dateSchedule;

    public ScheduleEntity(CustomerEntity customer, HelperEntity helper, LocalDateTime date_schedule) {
        this.id = null;        
        this.customer = customer;
        this.helper = helper;
        this.active = true;
        this.dateSchedule = date_schedule;
        this.dateCreated = LocalDateTime.now();
        this.dateUpdated = LocalDateTime.now();
    }    

    public ScheduleEntity(Long id, CustomerEntity customer, HelperEntity helper, LocalDateTime date_schedule, LocalDateTime date_created, LocalDateTime date_updated) {
        this.id = id;        
        this.customer = customer;
        this.helper = helper;
        this.dateSchedule = date_schedule;
        this.dateCreated = date_created;
        this.dateUpdated = date_updated;
    }    
}
