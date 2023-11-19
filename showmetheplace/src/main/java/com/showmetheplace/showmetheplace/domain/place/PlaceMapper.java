package com.showmetheplace.showmetheplace.domain.place;

import org.springframework.stereotype.Component;

import com.showmetheplace.showmetheplace.design.interfaces.Dto;
import com.showmetheplace.showmetheplace.design.interfaces.EntityIdentification;
import com.showmetheplace.showmetheplace.design.interfaces.EntityMapper;

@Component
public class PlaceMapper implements EntityMapper {

    @Override
    public Dto entityToDto(EntityIdentification entity) {
        
        PlaceEntity place = (PlaceEntity) entity;
        PlaceDto dto = new PlaceDto();
        dto.setCity(place.getCity());
        dto.setCountry(place.getCountry());

        return dto;
    }
    
}
