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
        InProgressDto scheduleDto = new InProgressDto();

        scheduleDto.setId(inProgressEntity.getId());
        scheduleDto.setCall((CallDto) callMapper.entityToDto(inProgressEntity.getCall()));
        scheduleDto.setHelper((HelperDto) helperMapper.entityToDto(inProgressEntity.getHelper()));                

        return scheduleDto;
    }
    
}
