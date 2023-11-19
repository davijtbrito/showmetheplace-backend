package com.showmetheplace.showmetheplace.domain.customer;

import com.showmetheplace.showmetheplace.design.interfaces.Dto;
import com.showmetheplace.showmetheplace.design.interfaces.RequestDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CustomerCreateRequest implements RequestDto {

    private String name;
    private String phone;
    private String email;

    @Override
    public Dto getDto() {
        CustomerDto dto = new CustomerDto();
        dto.setId(null);
        dto.setName(this.name);
        dto.setPhone(this.phone);
        dto.setEmail(this.email);
        dto.setAllowTip(false);

        return dto;
    }
    
}
