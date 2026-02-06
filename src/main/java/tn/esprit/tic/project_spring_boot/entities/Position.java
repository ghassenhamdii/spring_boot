package tn.esprit.tic.project_spring_boot.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Position {

    @Id
    private Long idPosition;

    private Integer classement;

    private Integer nbPoints;
}
