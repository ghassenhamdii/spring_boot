package tn.esprit.tic.project_spring_boot.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tic.project_spring_boot.entities.Championnat;
import tn.esprit.tic.project_spring_boot.service.IChampionnatService;

@RestController
@AllArgsConstructor
@RequestMapping("/championnat")
public class ChampionnatController {

    IChampionnatService championnatService;

    @PostMapping("/add-championnat")
    public Championnat ajouterChampionnat(@RequestBody Championnat championnat) {
        return championnatService.ajouterChampionnat(championnat);
    }
}