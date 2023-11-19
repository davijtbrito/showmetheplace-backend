package com.showmetheplace.showmetheplace.design.abstracts;

import jakarta.persistence.MappedSuperclass;
import lombok.Getter;

@Getter
@MappedSuperclass
public abstract class Person extends BaseEntity {    

    protected String name;
    protected String email;
    protected String phone;    
}
