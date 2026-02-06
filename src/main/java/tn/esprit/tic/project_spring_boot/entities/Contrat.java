package tn.esprit.tic.project_spring_boot.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Contrat {

    @Id
    private Long idContrat;

    private Float montant;

    private String annee;

    private Boolean archived;
}