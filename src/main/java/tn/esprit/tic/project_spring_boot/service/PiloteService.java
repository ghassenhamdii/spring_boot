package tn.esprit.tic.project_spring_boot.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tic.project_spring_boot.repository.PiloteRepository;
import tn.esprit.tic.project_spring_boot.entities.Pilote;

@Service
@AllArgsConstructor
public class PiloteService implements IPiloteService {

    private PiloteRepository piloteRepository;

    @Override
    public String addPilote(Pilote p) {
        piloteRepository.save(p);
        return "Pilote ajouté avec succès";
    }
}