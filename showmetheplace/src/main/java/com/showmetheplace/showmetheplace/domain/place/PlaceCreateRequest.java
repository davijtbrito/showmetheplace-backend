package com.showmetheplace.showmetheplace.domain.place;

import com.showmetheplace.showmetheplace.design.interfaces.Dto;
import com.showmetheplace.showmetheplace.design.interfaces.RequestDto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class PlaceCreateRequest implements RequestDto{

    private String country;
    private String city;  
    private String neighbourhood;

    @Override
    public Dto getDto() {

        PlaceDto dto = new PlaceDto();
        dto.setId(null);
        dto.setCountry(this.country);
        dto.setCity(this.city);  
        dto.setNeighbourhood(this.neighbourhood);      

        return dto;
    }
    
}
