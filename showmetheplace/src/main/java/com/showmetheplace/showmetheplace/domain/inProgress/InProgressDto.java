package com.showmetheplace.showmetheplace.domain.inProgress;


import com.showmetheplace.showmetheplace.design.interfaces.Dto;
import com.showmetheplace.showmetheplace.domain.call.CallDto;
import com.showmetheplace.showmetheplace.domain.helper.HelperDto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class InProgressDto implements Dto{

    private Long id;
    private CallDto call;    
    private HelperDto helper;
}
