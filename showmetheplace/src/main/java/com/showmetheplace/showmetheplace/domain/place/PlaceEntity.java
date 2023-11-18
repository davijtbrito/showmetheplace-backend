package com.showmetheplace.showmetheplace.domain.place;

import java.time.LocalDateTime;

import com.showmetheplace.showmetheplace.design.abstracts.BaseEntity;
import com.showmetheplace.showmetheplace.design.interfaces.Location;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "place")
public class PlaceEntity extends BaseEntity implements Location{    
    
    private String country;
    private String city;
    public PlaceEntity(Long id, Boolean active, LocalDateTime dateCreated, LocalDateTime dateUpdated, String country,
            String city) {                            

        this.country = country;
        this.city = city;
    }

    
}
