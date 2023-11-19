package com.showmetheplace.showmetheplace.domain.helper;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.showmetheplace.showmetheplace.design.interfaces.Crud;
import com.showmetheplace.showmetheplace.design.interfaces.Dto;

@Service
public class HelperService implements Crud {

    @Autowired
    private HelperRepository helperRepository;

    @Autowired
    private HelperMapper helperMapper;

    @Override
    public Dto create(Dto dto) {
        HelperDto helperDto = (HelperDto) dto;

        HelperEntity helper = this.helperRepository.save(new HelperEntity(helperDto.getName(),
                helperDto.getEmail(), helperDto.getPhone(), helperDto.isCallAtNight(), 
                helperDto.getCountry(), helperDto.getCity()));

        return helperMapper.entityToDto(helper);
    }

    @Override
    public Dto update(Dto dto) {
        
        HelperDto helperDto = (HelperDto) dto;

        Optional<HelperEntity> helper = this.helperRepository.findById(helperDto.getId());

        this.helperRepository.save(new HelperEntity(
                    helperDto.getId(),
                    helperDto.getName(),
                    helperDto.getEmail(),
                    helperDto.getPhone(),
                    helperDto.getCountry(),
                    helperDto.getCity(),
                    helperDto.isCallAtNight(),
                    helper.get().isActive(),
                    helper.get().getDateCreated(),
                    LocalDateTime.now()));

        return helper.isPresent() ? helperMapper.entityToDto(helper.get()) : null;
    }

    @Override
    public boolean remove(Long idEntity) {
         Optional<HelperEntity> helper = this.helperRepository.findById(idEntity);

        if (helper.isPresent()) {
            this.helperRepository.save(new HelperEntity(
                    idEntity,
                    helper.get().getName(),
                    helper.get().getEmail(),
                    helper.get().getPhone(),
                    helper.get().getCountry(),
                    helper.get().getCity(),
                    helper.get().isCallAtNight(),
                    false,
                    helper.get().getDateCreated(),
                    LocalDateTime.now()));

            return true;

        } else {
            return false;
        }
    }

    @Override
    public Page<Dto> getAll(Pageable pageable) {
         Page<HelperEntity> helperPage = this.helperRepository.findAll(pageable);

        return helperPage.map(h -> {
            HelperDto dto = new HelperDto();
            dto.setId(h.getId());
            dto.setName(h.getName());
            dto.setEmail(h.getEmail());
            dto.setPhone(h.getPhone());
            dto.setCountry(h.getCountry());
            dto.setCity(h.getCity());
            dto.setCallAtNight(h.isCallAtNight());

            return dto;
        });        
    }
    
}
