package com.showmetheplace.showmetheplace.domain.customer;

import java.time.LocalDateTime;

import com.showmetheplace.showmetheplace.design.abstracts.Person;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
@Table(name = "customer")
public class CustomerEntity extends Person{    
    private boolean allowTip;

    public CustomerEntity(String name, String email, String phone, boolean allowTip) {        

        this.id = null;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.allowTip = allowTip;        
        this.active = true;
        this.dateCreated = LocalDateTime.now();
        this.dateUpdated = LocalDateTime.now();        
    }    

    public CustomerEntity(Long id,String name, String email, String phone, boolean allowTip, 
        boolean active, LocalDateTime dateCreated, LocalDateTime dateUpdated) {        

        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.allowTip = allowTip;        
        this.active = active;
        this.dateCreated = dateCreated;
        this.dateUpdated = dateUpdated;        
    }   
}
