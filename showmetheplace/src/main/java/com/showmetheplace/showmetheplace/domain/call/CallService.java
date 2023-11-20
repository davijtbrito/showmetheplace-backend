package com.showmetheplace.showmetheplace.domain.call;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.showmetheplace.showmetheplace.design.interfaces.Dto;
import com.showmetheplace.showmetheplace.domain.customer.CustomerEntity;
import com.showmetheplace.showmetheplace.domain.customer.CustomerRepository;
import com.showmetheplace.showmetheplace.domain.place.PlaceEntity;
import com.showmetheplace.showmetheplace.domain.place.PlaceRepository;

@Service
public class CallService {
    
    @Autowired
    private CallRepository callRepository;

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private PlaceRepository placeRepository;

    @Autowired
    private CallMapper callMapper;

    public Dto call(CallDto callDto){
        
        Optional<CustomerEntity> cusOptional = this.customerRepository.findById(callDto.getCustomer().getId());
        Optional<PlaceEntity> placeOptional = this.placeRepository.findById(callDto.getPlace().getId());

        if (cusOptional.isPresent() && placeOptional.isPresent()){
            
            return callMapper.entityToDto(this.callRepository.save(new CallEntity(cusOptional.get(), placeOptional.get())));
        }
        
        return null;
    }

    public Dto findByCustomer(Long idCustomer){

        return this.callMapper.entityToDto(this.callRepository.findByCustomerId(idCustomer));
    }

    public Dto closeCall(Long id){
                
        Optional<CallEntity> optional = this.callRepository.findById(id);
        
        if (optional.isPresent()){
            return this.callMapper.entityToDto(this.callRepository.save(new CallEntity(id, 
            optional.get().getCustomerEntity(), 
            optional.get().getPlaceEntity(), 
            false, 
            optional.get().getDateCreated(), 
            LocalDateTime.now())));
        }
        
        return null;
    }
}