package com.showmetheplace.showmetheplace.domain.call;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CallCreateRequest {        

    private Long customerId;
    private Long placeId;    
}
