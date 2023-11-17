package com.showmetheplace.showmetheplace.mapper;

import com.showmetheplace.showmetheplace.design.DtoAbstract;
import com.showmetheplace.showmetheplace.design.EntityAbstract;
import com.showmetheplace.showmetheplace.design.MapperAbstract;
import com.showmetheplace.showmetheplace.dto.CustomerDto;
import com.showmetheplace.showmetheplace.entity.Customer;

public class CustomerMapper implements MapperAbstract{

    @Override
    public DtoAbstract entityToDto(EntityAbstract entity) {
        
        CustomerDto dto = new CustomerDto();
        dto.setId(((Customer) entity).getId());
        dto.setName(((Customer) entity).getName());
        dto.setEmail(((Customer) entity).getEmail());
        dto.setPhone(((Customer) entity).getPhone());
        dto.setAllowTip(((Customer) entity).isAllowTip());

        return dto;
    }    
}
