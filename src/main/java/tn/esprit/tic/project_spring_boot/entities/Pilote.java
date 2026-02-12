package tn.esprit.tic.project_spring_boot.entities;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Pilote {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPilote;

    private String libelleP;

    private Integer nbPointsTotal;

    private Integer classementGeneral;


    @ManyToOne
    @JoinColumn(name = "equipe_id")
    private Equipe equipe;


    @OneToMany(mappedBy = "pilote", cascade = CascadeType.ALL)
    private List<Position> positions;


}
