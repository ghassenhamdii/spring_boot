package tn.esprit.tic.project_spring_boot.Service;


import tn.esprit.tic.project_spring_boot.Repository.EquipeRepository;
import tn.esprit.tic.project_spring_boot.entities.Equipe;


public class EquipeServiceImpl implements IEquipeService {

   EquipeRepository equipeRepository;

    @Override
    public Equipe ajouterEquipe(Equipe equipe) {
        return equipeRepository.save(equipe);
    }
}
