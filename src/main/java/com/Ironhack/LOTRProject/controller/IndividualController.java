package com.Ironhack.LOTRProject.controller;

import com.Ironhack.LOTRProject.dto.DwarfDTO;
import com.Ironhack.LOTRProject.dto.ElfDTO;
import com.Ironhack.LOTRProject.dto.HumanDTO;
import com.Ironhack.LOTRProject.service.IndividualService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/individual")
public class IndividualController {

    @Autowired
    private IndividualService individualService;


    @PostMapping("/addElf") //crea un objeto Elfo
    public ResponseEntity addElf(@RequestBody ElfDTO elfDTO) {
        return ResponseEntity.ok(individualService.addIndividual(elfDTO));
    }

    @PostMapping("/addHuman") //crea un objeto Human
    public ResponseEntity addHuman(@RequestBody HumanDTO humanDTO) {
        return ResponseEntity.ok(individualService.addIndividual(humanDTO));
    }

    @PostMapping("/addDwarf") //crea un objeto Dwarf
    public ResponseEntity addDwarf(@RequestBody DwarfDTO dwarfDTO) {
        return ResponseEntity.ok(individualService.addIndividual(dwarfDTO));
    }

    @GetMapping("/all") //Lee todos los individuos, sin discriminar por raza
    public ResponseEntity getAll() {
        return ResponseEntity.ok(individualService.getAll());
    }

    @GetMapping("/allElfs") //Lee todos los individuos, discriminando por raza Elfo
    public ResponseEntity getAllElfs() {
        return ResponseEntity.ok(individualService.getAllElfs());
    }

    @GetMapping("/allHumans") //Lee todos los individuos, discriminando por raza Human
    public ResponseEntity getAllHuman() {
        return ResponseEntity.ok(individualService.getAllHumans());
    }

    @GetMapping("/allDwarfs") //Lee todos los individuos, discriminando por raza Dwarf
    public ResponseEntity getAllDwarfs() {
        return ResponseEntity.ok(individualService.getAllDwarfs());
    }

    @DeleteMapping("/{id}") //Borra el individuo cuya id coincida con la que le hemos indicado en el path
    public ResponseEntity deleteIndividual(@PathVariable int id) {
        return ResponseEntity.ok(individualService.deleteIndividual(id));
    }
}
