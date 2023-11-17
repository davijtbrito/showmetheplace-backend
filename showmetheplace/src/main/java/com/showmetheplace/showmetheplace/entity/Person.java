package com.showmetheplace.showmetheplace.entity;

import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public abstract class Person {    
    private String name;
    private String email;
    private String phone;
}
