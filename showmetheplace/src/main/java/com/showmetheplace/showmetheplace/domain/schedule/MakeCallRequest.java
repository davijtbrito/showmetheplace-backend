package com.showmetheplace.showmetheplace.domain.schedule;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class MakeCallRequest {

    private Long customerId;
    private Long helperId;
    private LocalDateTime scheduleDate;
    
}
