package tn.esprit.tic.project_spring_boot.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Equipe {

    @Id
    private Long idEquipe;

    private String libelle;

    private Integer nbPointsTotal;

    private Integer classementGeneral;
}