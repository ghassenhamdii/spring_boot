package tn.esprit.tic.project_spring_boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tic.project_spring_boot.entities.Equipe;
import org.springframework.stereotype.Repository;
@Repository
public interface EquipeRepository extends JpaRepository<Equipe, Long> {
}