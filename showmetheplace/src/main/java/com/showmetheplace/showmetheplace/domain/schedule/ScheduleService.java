package com.showmetheplace.showmetheplace.domain.schedule;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.showmetheplace.showmetheplace.design.interfaces.Dto;
import com.showmetheplace.showmetheplace.domain.customer.CustomerEntity;
import com.showmetheplace.showmetheplace.domain.customer.CustomerRepository;
import com.showmetheplace.showmetheplace.domain.helper.HelperEntity;
import com.showmetheplace.showmetheplace.domain.helper.HelperRepository;

@Service
public class ScheduleService {
    
    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private HelperRepository helperRepository;

    @Autowired
    private ScheduleRepository scheduleRepository;

    @Autowired
    private ScheduleMapper scheduleMapper;

    public Dto addSchedule(ScheduleDto dto){

        Optional<CustomerEntity> customerEntity = customerRepository.findById(dto.getCustomer().getId());
        Optional<HelperEntity> helperEntity = helperRepository.findById(dto.getHelper().getId());

        if (helperEntity.isPresent() && customerEntity.isPresent()){
            ScheduleEntity scheduleEntity = new ScheduleEntity(
                customerEntity.get(),
                helperEntity.get(),
                dto.getDateSchedule());                            

            return scheduleMapper.entityToDto(scheduleRepository.save(scheduleEntity));
        }

        return null;                
    }

    public void removeSchedule(Long id){
        this.scheduleRepository.deleteById(id);
    }
}
