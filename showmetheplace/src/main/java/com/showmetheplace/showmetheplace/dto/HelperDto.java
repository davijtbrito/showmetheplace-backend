package com.showmetheplace.showmetheplace.dto;

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
