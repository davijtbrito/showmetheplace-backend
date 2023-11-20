package com.showmetheplace.showmetheplace.domain.answer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.showmetheplace.showmetheplace.design.interfaces.Dto;
import com.showmetheplace.showmetheplace.design.interfaces.EntityIdentification;
import com.showmetheplace.showmetheplace.design.interfaces.EntityMapper;
import com.showmetheplace.showmetheplace.domain.call.CallDto;
import com.showmetheplace.showmetheplace.domain.call.CallMapper;
import com.showmetheplace.showmetheplace.domain.helper.HelperDto;
import com.showmetheplace.showmetheplace.domain.helper.HelperMapper;

@Component
public class AnswerMapper implements EntityMapper{

    @Autowired
    private CallMapper callMapper;

    @Autowired
    private HelperMapper helperMapper;

    @Override
    public Dto entityToDto(EntityIdentification entity) {        

        AnswerDto answerDto = new AnswerDto();
        answerDto.setId(((AnswerEntity) entity).getId());
        answerDto.setCall((CallDto) this.callMapper.entityToDto(((AnswerEntity) entity).getCall()));
        answerDto.setHelper((HelperDto) this.helperMapper.entityToDto(((AnswerEntity) entity).getHelper()));

        return answerDto;
    }
    
}
