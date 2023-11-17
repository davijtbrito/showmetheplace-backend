package com.showmetheplace.showmetheplace.entity;

import java.time.LocalDateTime;

import com.showmetheplace.showmetheplace.design.EntityAbstract;

import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public abstract class BaseEntity implements EntityAbstract{

    protected Long id;
    protected Boolean active;// this metadata should be seeing only in database context
    protected LocalDateTime dateCreated;// this metadata should be seeing only in database context
    protected LocalDateTime dateUpdated;// this metadata should be seeing only in database context
}
