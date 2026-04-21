package tn.esprit.tic.project_spring_boot.service;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tic.project_spring_boot.repository.EquipeRepository;
import tn.esprit.tic.project_spring_boot.entities.Equipe;

@Service
@AllArgsConstructor
public class EquipeService implements IEquipeService {
    EquipeRepository er;
    @Override
    public Equipe ajouterEquipe(Equipe equipe) {
        return er.save(equipe);
    }
}