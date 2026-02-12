package tn.esprit.tic.project_spring_boot.entities;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Championnat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idChampionnat;

    @Enumerated(EnumType.STRING)
    private Categorie categorie;

    private String libelleC;

    private Integer annee;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "detail_id")
    private DetailChampionnat detailChampionnat;


    @OneToMany(mappedBy = "championnat", cascade = CascadeType.ALL)
    private List<Course> courses;


}
