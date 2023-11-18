package com.showmetheplace.showmetheplace.domain.customer;

import com.showmetheplace.showmetheplace.design.interfaces.Dto;
import com.showmetheplace.showmetheplace.design.interfaces.RequestDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class UpdateCustomerRequest implements RequestDto{
    
    private Long id;
    private String name;
    private String phone;
    private String email;
    private boolean allowTip;

    @Override
    public Dto getDto() {
        
        CustomerDto dto = new CustomerDto();
        dto.setId(this.id);
        dto.setName(this.name);
        dto.setPhone(this.phone);
        dto.setEmail(this.email);
        dto.setAllowTip(this.allowTip);

        return dto;
    }
}
