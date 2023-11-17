package com.showmetheplace.showmetheplace.entity;

import java.time.LocalDateTime;

import com.showmetheplace.showmetheplace.design.EntityAbstract;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;

@Getter
@MappedSuperclass
public abstract class BaseEntity implements EntityAbstract{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;

    protected boolean active;// this metadata should be seeing only in database context
    protected LocalDateTime dateCreated;// this metadata should be seeing only in database context
    protected LocalDateTime dateUpdated;// this metadata should be seeing only in database context
}
