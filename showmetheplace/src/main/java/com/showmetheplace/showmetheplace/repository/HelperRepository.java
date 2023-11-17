package com.showmetheplace.showmetheplace.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.showmetheplace.showmetheplace.entity.Helper;

public interface HelperRepository extends JpaRepository<Helper, Long>{
    
}
