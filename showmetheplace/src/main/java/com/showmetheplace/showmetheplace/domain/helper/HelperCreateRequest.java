package com.showmetheplace.showmetheplace.domain.helper;

import com.showmetheplace.showmetheplace.design.interfaces.Dto;
import com.showmetheplace.showmetheplace.design.interfaces.RequestDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class HelperCreateRequest implements RequestDto{

    private String name;
    private String email;
    private String phone;
    private boolean callAtNight;
    private String country;
    private String city;    

    @Override
    public Dto getDto() {
        HelperDto dto = new HelperDto();
        dto.setId(null);
        dto.setName(this.name);
        dto.setEmail(this.email);
        dto.setPhone(this.phone);
        dto.setCountry(this.country);
        dto.setCity(this.city);
        dto.setCallAtNight(this.callAtNight);

        return dto;
    }
    
}
