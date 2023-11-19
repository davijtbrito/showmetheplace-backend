package com.showmetheplace.showmetheplace.domain.helper;

import org.springframework.stereotype.Component;

import com.showmetheplace.showmetheplace.design.interfaces.Dto;
import com.showmetheplace.showmetheplace.design.interfaces.EntityIdentification;
import com.showmetheplace.showmetheplace.design.interfaces.EntityMapper;

@Component
public class HelperMapper implements EntityMapper{

    @Override
    public Dto entityToDto(EntityIdentification entity) {

        HelperEntity helper = (HelperEntity) entity;
        HelperDto dto = new HelperDto();
        dto.setId(helper.getId());        
        dto.setName(helper.getName());
        dto.setPhone(helper.getPhone());
        dto.setCallAtNight(helper.isCallAtNight());
        dto.setCountry(helper.getCountry());
        dto.setCity(helper.getCity());

        return dto;
    }
    
}
