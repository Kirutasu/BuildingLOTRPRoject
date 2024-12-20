package com.Ironhack.LOTRProject.dao;

import com.Ironhack.LOTRProject.enums.RaceSpecialization;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "id")
@Data
public class Human extends Individual {

    @Column
    private RaceSpecialization raceSpecialization;

    @Column
    private String kingdom;

    @Column
    private String lineage;


}
