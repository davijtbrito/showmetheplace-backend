package com.showmetheplace.showmetheplace.domain.helper;

import java.time.LocalDateTime;

import com.showmetheplace.showmetheplace.design.abstracts.Person;
import com.showmetheplace.showmetheplace.design.interfaces.Location;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
@Table(name = "helper")
public class HelperEntity extends Person implements Location {

    private boolean callAtNight;
    private String country;
    private String city;    

    public HelperEntity(String name, String email, String phone, boolean callAtNight, String country, String city) {        
        
        this.id = null;        
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.country = country;
        this.city = city;
        this.callAtNight = callAtNight;
        this.active = true;
        this.dateCreated = LocalDateTime.now();
        this.dateUpdated = LocalDateTime.now();                          
    };        

    public HelperEntity(Long id, String name, String email, String phone, String country, 
        String city, boolean callAtNight, boolean isActive, LocalDateTime dateCreated, LocalDateTime dateUpdated) {        
        
        this.id = id;        
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.callAtNight = callAtNight;
        this.country = country;
        this.city = city;
        this.active = isActive;
        this.dateCreated = dateCreated;
        this.dateUpdated = dateUpdated;   
    };
}
