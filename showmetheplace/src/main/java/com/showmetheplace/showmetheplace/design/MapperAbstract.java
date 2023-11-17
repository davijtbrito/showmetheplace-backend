package com.showmetheplace.showmetheplace.design;

public interface MapperAbstract {
    DtoAbstract entityToDto(EntityAbstract entity);
    EntityAbstract dtoToEntity(DtoAbstract dto);
}
