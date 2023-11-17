package com.showmetheplace.showmetheplace.entity;

import jakarta.persistence.MappedSuperclass;
import lombok.Getter;

@Getter
@MappedSuperclass
public abstract class Person extends BaseEntity {    

    protected String name;
    protected String email;
    protected String phone;    
}
