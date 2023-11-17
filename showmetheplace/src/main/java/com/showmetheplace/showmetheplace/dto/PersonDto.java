package com.showmetheplace.showmetheplace.dto;

import com.showmetheplace.showmetheplace.design.DtoAbstract;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public abstract class PersonDto implements DtoAbstract{
 
    protected Long id;
    protected String name;
    protected String email;
    protected String phone;   
}
