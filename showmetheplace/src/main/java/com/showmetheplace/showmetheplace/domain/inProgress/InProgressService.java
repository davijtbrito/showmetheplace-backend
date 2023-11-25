package com.showmetheplace.showmetheplace.domain.inProgress;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.showmetheplace.showmetheplace.design.interfaces.Dto;
import com.showmetheplace.showmetheplace.design.interfaces.CloseOperation;
import com.showmetheplace.showmetheplace.domain.call.CallEntity;
import com.showmetheplace.showmetheplace.domain.call.CallRepository;
import com.showmetheplace.showmetheplace.domain.helper.HelperEntity;
import com.showmetheplace.showmetheplace.domain.helper.HelperRepository;

import jakarta.transaction.Transactional;

@Service
public class InProgressService implements CloseOperation{
    
    @Autowired
    private CallRepository callRepository;

    @Autowired
    private HelperRepository helperRepository;

    @Autowired
    private InProgressRepository inProgressRepository;

    @Autowired
    private InProgressMapper inProgressMapper;

    public Dto add(Long callId, Long helperId){

        Optional<CallEntity> callOptional = callRepository.findById(callId);
        Optional<HelperEntity> helperEntity = helperRepository.findById(helperId);

        if (helperEntity.isPresent() && callOptional.isPresent()){
            InProgressEntity inProgress = new InProgressEntity(
                callOptional.get(),
                helperEntity.get());

            return inProgressMapper.entityToDto(inProgressRepository.save(inProgress));
        }

        return null;                
    }    

    @Override
    @Transactional
    public void close(Long id) {
        
         Optional<InProgressEntity> optionalInProgress = inProgressRepository.findById(id);

        if (optionalInProgress.isPresent()){

            Optional<CallEntity> callOptional = callRepository.findById(optionalInProgress.get().getCall().getId());
            Optional<HelperEntity> helperEntity = helperRepository.findById(optionalInProgress.get().getHelper().getId());

            if (helperEntity.isPresent() && callOptional.isPresent()){
                InProgressEntity inProgress = new InProgressEntity(
                    optionalInProgress.get().getId(),
                    callOptional.get(),
                    helperEntity.get(),
                    false,
                    optionalInProgress.get().getDateCreated(),
                    LocalDateTime.now());

                inProgressRepository.save(inProgress);

                //TODO close  Call and answer
            }
        }
    }
}
