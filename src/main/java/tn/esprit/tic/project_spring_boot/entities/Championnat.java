package tn.esprit.tic.project_spring_boot.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Championnat {

    @Id
    private Long idChampionnat;

    private Categorie categorie;

    private String libelleC;

    private Integer annee;
}
