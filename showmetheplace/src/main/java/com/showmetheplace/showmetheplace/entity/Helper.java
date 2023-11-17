package com.showmetheplace.showmetheplace.entity;

import com.showmetheplace.showmetheplace.design.EntityAbstract;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "helper")
public class Helper extends Person implements EntityAbstract{
    private Long id;
}
