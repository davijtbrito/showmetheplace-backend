package com.showmetheplace.showmetheplace.domain.place;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PlaceRepository extends JpaRepository<PlaceEntity, Long>{
    
}
