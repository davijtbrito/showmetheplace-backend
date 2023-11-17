package com.showmetheplace.showmetheplace.design;

public interface Factory {
    
    DtoAbstract buildDto();
    EntityAbstract buildEntity();
}
