package com.showmetheplace.showmetheplace.design;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface Crud {
    
    DtoAbstract create(DtoAbstract dto);
    DtoAbstract update(DtoAbstract dto);
    boolean remove(Long idEntity);
    Page<DtoAbstract> getAll(Pageable pageable);    

}
