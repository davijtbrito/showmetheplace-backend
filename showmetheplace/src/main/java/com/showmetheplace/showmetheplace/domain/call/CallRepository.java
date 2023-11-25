package com.showmetheplace.showmetheplace.domain.call;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CallRepository extends JpaRepository<CallEntity, Long>{
    
    @Query("SELECT c FROM CallEntity c WHERE c.customer.id = :customerId AND c.active = true")
    CallEntity findByCustomerId(Long customerId);

}
