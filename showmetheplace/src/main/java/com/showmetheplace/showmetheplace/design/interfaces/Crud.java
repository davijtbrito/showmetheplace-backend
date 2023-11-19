package com.showmetheplace.showmetheplace.design.interfaces;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface Crud {
    
    Dto create(Dto dto);
    Dto update(Dto dto);
    boolean remove(Long idEntity);
    Page<Dto> getAll(Pageable pageable);    

}
