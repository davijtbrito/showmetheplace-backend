package com.showmetheplace.showmetheplace.domain.schedule;

import java.time.LocalDateTime;

import com.showmetheplace.showmetheplace.design.interfaces.Dto;
import com.showmetheplace.showmetheplace.domain.customer.CustomerDto;
import com.showmetheplace.showmetheplace.domain.helper.HelperDto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class ScheduleDto implements Dto{

    private Long id;
    private CustomerDto customer;    
    private HelperDto helper;
    private LocalDateTime dateSchedule;    
}
