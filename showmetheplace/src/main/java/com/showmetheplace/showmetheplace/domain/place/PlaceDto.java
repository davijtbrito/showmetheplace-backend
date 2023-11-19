package com.showmetheplace.showmetheplace.domain.place;

import com.showmetheplace.showmetheplace.design.interfaces.Dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class PlaceDto implements Dto {
    
    private Long id;
    private String country;
    private String city;
}
