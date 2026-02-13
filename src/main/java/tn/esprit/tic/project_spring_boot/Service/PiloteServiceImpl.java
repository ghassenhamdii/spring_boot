package tn.esprit.tic.project_spring_boot.Service;


import tn.esprit.tic.project_spring_boot.Repository.PiloteRepository;
import tn.esprit.tic.project_spring_boot.entities.Pilote;


public class PiloteServiceImpl implements IPiloteService {

   PiloteRepository piloteRepository;

    @Override
    public String addPilote(Pilote p) {
        piloteRepository.save(p);
        return "Pilote ajouté avec succès";
    }
}
