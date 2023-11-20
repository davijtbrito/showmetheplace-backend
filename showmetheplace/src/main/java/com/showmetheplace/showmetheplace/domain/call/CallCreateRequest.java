package com.showmetheplace.showmetheplace.domain.call;

import org.springframework.beans.factory.annotation.Autowired;

import com.showmetheplace.showmetheplace.design.interfaces.Dto;
import com.showmetheplace.showmetheplace.design.interfaces.RequestDto;
import com.showmetheplace.showmetheplace.domain.customer.CustomerDto;
import com.showmetheplace.showmetheplace.domain.customer.CustomerMapper;
import com.showmetheplace.showmetheplace.domain.customer.CustomerRepository;
import com.showmetheplace.showmetheplace.domain.place.PlaceDto;
import com.showmetheplace.showmetheplace.domain.place.PlaceMapper;
import com.showmetheplace.showmetheplace.domain.place.PlaceRepository;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CallCreateRequest implements RequestDto{
    
    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerMapper customerMapper;

    @Autowired
    private PlaceRepository placeRepository;

    @Autowired
    private PlaceMapper placeMapper;    

    private Long customerId;
    private Long placeId;

    @Override
    public Dto getDto() {
        CallDto dto = new CallDto();
        dto.setId(null);
        dto.setCustomer((CustomerDto) this.customerMapper.entityToDto(this.customerRepository.findById(this.customerId).get()));
        dto.setPlace((PlaceDto) this.placeMapper.entityToDto(this.placeRepository.findById(this.placeId).get()));

        return dto;
    }
}
