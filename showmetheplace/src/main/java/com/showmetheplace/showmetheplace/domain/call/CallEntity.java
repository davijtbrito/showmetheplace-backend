package com.showmetheplace.showmetheplace.domain.call;

import java.time.LocalDateTime;

import com.showmetheplace.showmetheplace.design.abstracts.BaseEntity;
import com.showmetheplace.showmetheplace.domain.customer.CustomerEntity;
import com.showmetheplace.showmetheplace.domain.place.PlaceEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
@Table(name = "call")
public class CallEntity extends BaseEntity{
    
    @OneToOne
    private CustomerEntity customer;

    @OneToOne
    private PlaceEntity place;

    public CallEntity(CustomerEntity customer, PlaceEntity place) {
        this.id = null;
        this.customer = customer;
        this.place = place;        
        this.active = true;
        this.dateCreated = LocalDateTime.now();
        this.dateUpdated = LocalDateTime.now();
    }    

    public CallEntity(Long id, CustomerEntity customer, PlaceEntity place, boolean isActive, LocalDateTime dateCreated, LocalDateTime dateUpdated) {
        this.id = id;
        this.customer = customer;
        this.place = place;        
        this.active = isActive;
        this.dateCreated = dateCreated;
        this.dateUpdated = dateUpdated;
    }
}
