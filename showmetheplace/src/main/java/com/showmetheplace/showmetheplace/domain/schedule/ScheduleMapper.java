package com.showmetheplace.showmetheplace.domain.schedule;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.showmetheplace.showmetheplace.design.interfaces.Dto;
import com.showmetheplace.showmetheplace.design.interfaces.EntityIdentification;
import com.showmetheplace.showmetheplace.design.interfaces.EntityMapper;
import com.showmetheplace.showmetheplace.domain.customer.CustomerDto;
import com.showmetheplace.showmetheplace.domain.customer.CustomerMapper;
import com.showmetheplace.showmetheplace.domain.helper.HelperDto;
import com.showmetheplace.showmetheplace.domain.helper.HelperMapper;

@Component
public class ScheduleMapper implements EntityMapper{

    @Autowired
    private CustomerMapper customerMapper;

    @Autowired
    private HelperMapper helperMapper;

    @Override
    public Dto entityToDto(EntityIdentification entity) {

        ScheduleEntity scheduleEntity = (ScheduleEntity) entity;
        ScheduleDto scheduleDto = new ScheduleDto();

        scheduleDto.setId(scheduleEntity.getId());
        scheduleDto.setCustomer((CustomerDto) customerMapper.entityToDto(scheduleEntity.getCustomer()));
        scheduleDto.setHelper((HelperDto) helperMapper.entityToDto(scheduleEntity.getHelper()));        
        scheduleDto.setDateSchedule(scheduleEntity.getDateSchedule());

        return scheduleDto;
    }
    
}
