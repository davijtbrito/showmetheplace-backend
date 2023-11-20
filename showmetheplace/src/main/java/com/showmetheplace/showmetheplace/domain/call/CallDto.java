package com.showmetheplace.showmetheplace.domain.call;

import com.showmetheplace.showmetheplace.design.interfaces.Dto;
import com.showmetheplace.showmetheplace.domain.customer.CustomerDto;
import com.showmetheplace.showmetheplace.domain.place.PlaceDto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CallDto implements Dto {
    
    private Long id;  
    private CustomerDto customer;
    private PlaceDto place;
}
