package com.showmetheplace.showmetheplace.domain.answer;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.showmetheplace.showmetheplace.design.interfaces.Dto;
import com.showmetheplace.showmetheplace.domain.call.CallEntity;
import com.showmetheplace.showmetheplace.domain.call.CallRepository;
import com.showmetheplace.showmetheplace.domain.helper.HelperEntity;
import com.showmetheplace.showmetheplace.domain.helper.HelperRepository;

@Service
public class AnswerService {
    
    @Autowired
    private AnswerRepository answerRepository;

    @Autowired
    private CallRepository callRepository;

    @Autowired
    private HelperRepository helperRepository;

    @Autowired
    private AnswerMapper answerMapper;

    public Dto answerCall(Long callId, Long helperId){
        
        Optional<CallEntity> optionalCall = this.callRepository.findById(callId);
        Optional<HelperEntity> optionalHelper = this.helperRepository.findById(helperId) ;

        if (optionalCall.isPresent() && optionalHelper.isPresent()) {
            return this.answerMapper.entityToDto(this.answerRepository.save(new AnswerEntity(optionalCall.get(), optionalHelper.get())));
        }
        
        return null;
    }
}
