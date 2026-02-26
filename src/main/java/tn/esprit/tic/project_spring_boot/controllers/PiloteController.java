package tn.esprit.tic.project_spring_boot.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.tic.project_spring_boot.service.IPiloteService;

@RestController
@AllArgsConstructor
@RequestMapping("/pilote")
public class PiloteController {
    IPiloteService PiloteService;
}
