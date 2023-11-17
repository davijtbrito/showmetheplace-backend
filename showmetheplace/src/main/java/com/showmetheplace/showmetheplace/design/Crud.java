package com.showmetheplace.showmetheplace.design;

import java.util.List;

public interface Crud {
    
    DtoAbstract create(DtoAbstract dto);
    DtoAbstract update(Long idEntity, DtoAbstract dto);
    boolean remove(Long idEntity);
    List<DtoAbstract> getAll();    

}
