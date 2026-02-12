package tn.esprit.tic.project_spring_boot.entities;

import jakarta.persistence.*;

@Entity
public class DetailChampionnat {

    @Id
    private String code;

    private String description;

    @OneToOne(mappedBy = "detailChampionnat")
    private Championnat championnat;


}
