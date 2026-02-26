package tn.esprit.tic.project_spring_boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.tic.project_spring_boot.entities.Pilote;

@Repository
public interface PiloteRepository extends JpaRepository<Pilote, Long> {
}
