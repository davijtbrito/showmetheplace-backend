package com.showmetheplace.showmetheplace.domain.place;

import com.showmetheplace.showmetheplace.design.interfaces.Dto;
import com.showmetheplace.showmetheplace.design.interfaces.RequestDto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class PlaceUpdateRequest implements RequestDto {

    private Long id;
    private String country;
    private String city;    

    @Override
    public Dto getDto() {
        PlaceDto dto = new PlaceDto();
        dto.setId(this.id);
        dto.setCountry(this.country);
        dto.setCity(this.city);        

        return dto;
    }
    
}
