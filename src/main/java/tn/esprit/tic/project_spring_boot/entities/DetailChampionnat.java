package tn.esprit.tic.project_spring_boot.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class DetailChampionnat {

    @Id
    private String code;

    private String description;
}