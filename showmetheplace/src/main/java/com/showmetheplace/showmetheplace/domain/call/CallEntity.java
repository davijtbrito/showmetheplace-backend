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
@Table(name = "request")
public class CallEntity extends BaseEntity{
    
    @OneToOne
    private CustomerEntity customerEntity;

    @OneToOne
    private PlaceEntity placeEntity;

    public CallEntity(CustomerEntity customerEntity, PlaceEntity placeEntity) {
        this.id = null;
        this.customerEntity = customerEntity;
        this.placeEntity = placeEntity;        
        this.active = true;
        this.dateCreated = LocalDateTime.now();
        this.dateUpdated = LocalDateTime.now();
    }    

    public CallEntity(Long id, CustomerEntity customerEntity, PlaceEntity placeEntity, boolean isActive, LocalDateTime dateCreated, LocalDateTime dateUpdated) {
        this.id = id;
        this.customerEntity = customerEntity;
        this.placeEntity = placeEntity;        
        this.active = isActive;
        this.dateCreated = dateCreated;
        this.dateUpdated = dateUpdated;
    }
}
