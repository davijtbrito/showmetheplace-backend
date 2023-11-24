package com.showmetheplace.showmetheplace.domain.answer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class AnswerCallCreateRequest {
    
    private Long callId;
    private Long helperId;
}
