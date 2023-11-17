package com.showmetheplace.showmetheplace.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "customer")
public class Customer extends Person{    
    private boolean allowTip;

    public Customer(String name, String email, String phone, boolean allowTip) {
        super(name, email, phone);
        this.allowTip = allowTip;
    }
    
}
