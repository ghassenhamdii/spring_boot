package tn.esprit.tic.project_spring_boot.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Sponsor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSponsor;

    private String nomSponsor;
    private String adresse;
    private Float budget;

    private LocalDate dateCreation;
    private LocalDate dateDerniereModification;

    private Boolean archived;
    private Boolean bloquerContrat;
}
