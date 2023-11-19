package com.showmetheplace.showmetheplace.domain.customer;

import com.showmetheplace.showmetheplace.design.abstracts.PersonDto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class CustomerDto extends PersonDto{
    
    private boolean allowTip;
}
