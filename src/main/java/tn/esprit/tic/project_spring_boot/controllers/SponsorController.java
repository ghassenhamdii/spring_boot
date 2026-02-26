package tn.esprit.tic.project_spring_boot.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tic.project_spring_boot.service.ISponsorService;

@RestController
@AllArgsConstructor
@RequestMapping("/sponsor")
public class SponsorController {

    ISponsorService SponsorService; // ← injection auto via @AllArgsConstructor


}