package com.showmetheplace.showmetheplace.entity;

import com.showmetheplace.showmetheplace.design.Location;

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
public class Place extends BaseEntity implements Location{    
    
    private String country;
    private String city;
}
