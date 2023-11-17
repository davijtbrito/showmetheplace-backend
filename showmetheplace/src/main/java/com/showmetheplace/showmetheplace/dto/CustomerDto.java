package com.showmetheplace.showmetheplace.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class CustomerDto extends PersonDto{
    
    private boolean allowTip;
}
