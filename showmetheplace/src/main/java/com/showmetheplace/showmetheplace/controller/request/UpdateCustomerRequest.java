package com.showmetheplace.showmetheplace.controller.request;

import com.showmetheplace.showmetheplace.design.DtoAbstract;
import com.showmetheplace.showmetheplace.design.RequestAbstract;
import com.showmetheplace.showmetheplace.dto.CustomerDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class UpdateCustomerRequest implements RequestAbstract{
    
    private Long id;
    private String name;
    private String phone;
    private String email;
    private boolean allowTip;

    @Override
    public DtoAbstract getDto() {
        
        CustomerDto dto = new CustomerDto();
        dto.setId(this.id);
        dto.setName(this.name);
        dto.setPhone(this.phone);
        dto.setEmail(this.email);
        dto.setAllowTip(this.allowTip);

        return dto;
    }
}
