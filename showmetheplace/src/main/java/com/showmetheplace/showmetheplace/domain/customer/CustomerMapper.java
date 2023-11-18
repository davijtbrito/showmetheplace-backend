package com.showmetheplace.showmetheplace.domain.customer;

import org.springframework.stereotype.Component;

import com.showmetheplace.showmetheplace.design.interfaces.Dto;
import com.showmetheplace.showmetheplace.design.interfaces.EntityIdentification;
import com.showmetheplace.showmetheplace.design.interfaces.EntityMapper;

@Component
public class CustomerMapper implements EntityMapper{

    @Override
    public Dto entityToDto(EntityIdentification entity) {
        
        CustomerDto dto = new CustomerDto();
        dto.setId(((CustomerEntity) entity).getId());
        dto.setName(((CustomerEntity) entity).getName());
        dto.setEmail(((CustomerEntity) entity).getEmail());
        dto.setPhone(((CustomerEntity) entity).getPhone());
        dto.setAllowTip(((CustomerEntity) entity).isAllowTip());

        return dto;
    }    
}
