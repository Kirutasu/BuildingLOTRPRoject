package com.Ironhack.LOTRProject.dao;

import com.Ironhack.LOTRProject.enums.RaceSpecialization;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "id")
@Data
public class Elf extends Individual {

    @Column
    private String kingdom;

    @Column
    private int longevity;

    @Column
    private String elfRace;
    @Column
    private RaceSpecialization raceSpecialization;

}
