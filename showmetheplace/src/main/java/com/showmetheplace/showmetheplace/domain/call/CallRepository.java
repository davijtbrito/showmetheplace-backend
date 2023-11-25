package com.showmetheplace.showmetheplace.domain.call;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CallRepository extends JpaRepository<CallEntity, Long>{
    
    @Query("SELECT c FROM CallEntity c WHERE c.customer.id = :customerId AND c.active = true")
    CallEntity findByCustomerId(Long customerId);

    @Query("SELECT c FROM CallEntity c WHERE c.place.id = :placeId AND c.active = true")
    List<CallEntity> findAllByPlaceId(Long placeId);

}
