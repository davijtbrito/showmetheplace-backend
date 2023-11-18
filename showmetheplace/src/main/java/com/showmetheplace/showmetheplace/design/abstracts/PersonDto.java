package com.showmetheplace.showmetheplace.design.abstracts;

import com.showmetheplace.showmetheplace.design.interfaces.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public abstract class PersonDto implements Dto{
 
    protected Long id;
    protected String name;
    protected String email;
    protected String phone;   
}
