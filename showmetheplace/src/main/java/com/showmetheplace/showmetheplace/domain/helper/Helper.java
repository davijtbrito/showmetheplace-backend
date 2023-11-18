package com.showmetheplace.showmetheplace.domain.helper;

import java.time.LocalDateTime;

import com.showmetheplace.showmetheplace.design.abstracts.Person;
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
@Table(name = "helper")
public class Helper extends Person implements Location {

    private boolean callAtNight;
    private String country;
    private String city;    

    public Helper(String name, String email, String phone, boolean callAtNight, String country, String city) {        
        
        this.id = null;        
        this.active = true;
        this.dateCreated = LocalDateTime.now();
        this.dateUpdated = LocalDateTime.now();   

        this.callAtNight = callAtNight;
        this.country = country;
        this.city = city;
    };        
}
