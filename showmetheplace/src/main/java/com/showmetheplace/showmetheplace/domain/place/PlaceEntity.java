package com.showmetheplace.showmetheplace.domain.place;

import java.time.LocalDateTime;

import com.showmetheplace.showmetheplace.design.abstracts.BaseEntity;
import com.showmetheplace.showmetheplace.design.interfaces.Location;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
@Table(name = "place")
public class PlaceEntity extends BaseEntity implements Location{    
    
    private String country;
    private String city;

    public PlaceEntity(String country, String city) {                            

        this.id = null;
        this.active = true;
        this.country = country;
        this.city = city;
        this.dateCreated = LocalDateTime.now();
        this.dateUpdated = LocalDateTime.now();
    }

    public PlaceEntity(Long id, String country, String city, boolean isActive, LocalDateTime dateCreated, LocalDateTime dateUpdated) {                            

        this.id = id;
        this.active = isActive;
        this.country = country;
        this.city = city;
        this.dateCreated = dateCreated;
        this.dateUpdated = dateUpdated;
    }

    
}
