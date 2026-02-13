package tn.esprit.tic.project_spring_boot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tic.project_spring_boot.entities.Equipe;

public interface EquipeRepository extends JpaRepository<Equipe, Long> {
}
