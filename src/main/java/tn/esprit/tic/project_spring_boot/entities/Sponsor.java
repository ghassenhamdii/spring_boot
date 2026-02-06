package tn.esprit.tic.project_spring_boot.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Sponsor {

    @Id
    private Long idSponsor;

    private String nom;

    private String pays;

    private Float budgetAnnuel;

    private Boolean bloquerContrat;
}