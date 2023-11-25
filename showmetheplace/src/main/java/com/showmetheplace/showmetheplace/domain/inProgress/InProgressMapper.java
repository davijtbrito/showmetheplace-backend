package com.showmetheplace.showmetheplace.domain.inProgress;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.showmetheplace.showmetheplace.design.interfaces.Dto;
import com.showmetheplace.showmetheplace.design.interfaces.EntityIdentification;
import com.showmetheplace.showmetheplace.design.interfaces.EntityMapper;
import com.showmetheplace.showmetheplace.domain.call.CallDto;
import com.showmetheplace.showmetheplace.domain.call.CallMapper;
import com.showmetheplace.showmetheplace.domain.helper.HelperDto;
import com.showmetheplace.showmetheplace.domain.helper.HelperMapper;

@Component
public class InProgressMapper implements EntityMapper{

    @Autowired
    private CallMapper callMapper;

    @Autowired
    private HelperMapper helperMapper;

    @Override
    public Dto entityToDto(EntityIdentification entity) {

        InProgressEntity inProgressEntity = (InProgressEntity) entity;
        InProgressDto inProgressDto = new InProgressDto();

        inProgressDto.setId(inProgressEntity.getId());
        inProgressDto.setCall((CallDto) callMapper.entityToDto(inProgressEntity.getCall()));
        inProgressDto.setHelper((HelperDto) helperMapper.entityToDto(inProgressEntity.getHelper()));                

        return inProgressDto;
    }
    
}
