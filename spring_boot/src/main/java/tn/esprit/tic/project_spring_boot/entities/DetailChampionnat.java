package tn.esprit.tic.project_spring_boot.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DetailChampionnat {

    @Id
    private String code;

    private String description;

    @OneToOne(mappedBy = "detailChampionnat")
    private Championnat championnat;


}
