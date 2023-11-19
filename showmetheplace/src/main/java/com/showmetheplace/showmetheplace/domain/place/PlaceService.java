package com.showmetheplace.showmetheplace.domain.place;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.showmetheplace.showmetheplace.design.interfaces.Crud;
import com.showmetheplace.showmetheplace.design.interfaces.Dto;

@Service
public class PlaceService implements Crud{

    @Autowired
    private PlaceMapper placeMapper;

    @Autowired
    private PlaceRepository placeRepository;

    @Override
    public Dto create(Dto dto) {
        PlaceDto placeDto = (PlaceDto) dto;

        PlaceEntity helper = this.placeRepository.save(new PlaceEntity(placeDto.getCountry(), 
            placeDto.getCity(), placeDto.getNeighbourhood()));

        return placeMapper.entityToDto(helper);
    }

    @Override
    public Dto update(Dto dto) {
        
        PlaceDto placeDto = (PlaceDto) dto;

        Optional<PlaceEntity> place = this.placeRepository.findById(placeDto.getId());

        this.placeRepository.save(new PlaceEntity(
                    placeDto.getId(),
                    placeDto.getCountry(),
                    placeDto.getCity(),
                    placeDto.getNeighbourhood(),                    
                    place.get().isActive(),
                    place.get().getDateCreated(),
                    LocalDateTime.now()));

        return place.isPresent() ? placeMapper.entityToDto(place.get()) : null;
    }

    @Override
    public boolean remove(Long idEntity) {
        
        Optional<PlaceEntity> place = this.placeRepository.findById(idEntity);

        if (place.isPresent()) {
            this.placeRepository.save(new PlaceEntity(
                    idEntity,
                    place.get().getCountry(),
                    place.get().getCity(),      
                    place.get().getNeighbourhood(),                                  
                    false,
                    place.get().getDateCreated(),
                    LocalDateTime.now()));

            return true;

        } else {
            return false;
        }
    }

    @Override
    public Page<Dto> getAll(Pageable pageable) {
        
        Page<PlaceEntity> placePage = this.placeRepository.findAll(pageable);

        return placePage.map(p -> {            

            return (PlaceDto) this.placeMapper.entityToDto(p);
        });        
    }
    
}
