package com.showmetheplace.showmetheplace.domain.helper;

import com.showmetheplace.showmetheplace.design.abstracts.PersonDto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class HelperDto extends PersonDto{
    
    private boolean callAtNight;
    private String country;
    private String city;    
}
