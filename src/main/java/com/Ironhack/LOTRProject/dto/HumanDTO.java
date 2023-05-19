package com.Ironhack.LOTRProject.dto;

import com.Ironhack.LOTRProject.enums.RaceSpecialization;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
public class HumanDTO extends IndividualDTO {

    @NotEmpty
    private RaceSpecialization raceSpecialization;
    @NotNull
    private String kingdom;
    private String lineage;


}
