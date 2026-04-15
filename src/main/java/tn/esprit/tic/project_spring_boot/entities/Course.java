package tn.esprit.tic.project_spring_boot.entities;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCourse;

    private String emplacement;

    private LocalDate dateCourse;


    @ManyToOne
    @JoinColumn(name = "championnat_id")
    private Championnat championnat;


    @OneToMany(mappedBy = "course", cascade = CascadeType.ALL)
    private List<Position> positions;


}
