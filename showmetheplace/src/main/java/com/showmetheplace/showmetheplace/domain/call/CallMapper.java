package com.showmetheplace.showmetheplace.domain.call;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.showmetheplace.showmetheplace.design.interfaces.Dto;
import com.showmetheplace.showmetheplace.design.interfaces.EntityIdentification;
import com.showmetheplace.showmetheplace.design.interfaces.EntityMapper;
import com.showmetheplace.showmetheplace.domain.customer.CustomerDto;
import com.showmetheplace.showmetheplace.domain.customer.CustomerMapper;
import com.showmetheplace.showmetheplace.domain.place.PlaceDto;
import com.showmetheplace.showmetheplace.domain.place.PlaceMapper;

@Component
public class CallMapper implements EntityMapper{

    @Autowired
    private PlaceMapper placeMapper;

    @Autowired
    private CustomerMapper customerMapper;

    @Override
    public Dto entityToDto(EntityIdentification entity) {

        CallEntity callEntity = (CallEntity) entity;
        CallDto callDto = new CallDto();
        callDto.setId(callEntity.getId());
        callDto.setCustomer((CustomerDto) customerMapper.entityToDto(callEntity.getCustomer()));
        callDto.setPlace((PlaceDto) placeMapper.entityToDto(callEntity.getPlace()));        

        return callDto;
    }
    
}
