package com.showmetheplace.showmetheplace.domain.answer;

import com.showmetheplace.showmetheplace.design.interfaces.Dto;
import com.showmetheplace.showmetheplace.domain.call.CallDto;
import com.showmetheplace.showmetheplace.domain.helper.HelperDto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class AnswerDto implements Dto{
    
    private Long id;
    private CallDto call;
    private HelperDto helper;
}
