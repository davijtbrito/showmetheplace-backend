package com.showmetheplace.showmetheplace.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.showmetheplace.showmetheplace.entity.Place;

public interface PlaceRepository extends JpaRepository<Place, Long>{
    
}
