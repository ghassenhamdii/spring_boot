package tn.esprit.tic.project_spring_boot.entities;

import jakarta.persistence.*;

@Entity
public class Contrat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idContrat;

    private Float montant;

    private String annee;

    private Boolean archived;


    @ManyToOne
    @JoinColumn(name = "equipe_id")
    private Equipe equipe;


    @ManyToOne
    @JoinColumn(name = "sponsor_id")
    private Sponsor sponsor;

}
