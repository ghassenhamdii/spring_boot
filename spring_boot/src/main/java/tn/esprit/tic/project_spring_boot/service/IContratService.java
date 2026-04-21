package tn.esprit.tic.project_spring_boot.service;

import tn.esprit.tic.project_spring_boot.entities.Contrat;
import java.util.List;

public interface IContratService {
    Contrat addContrat(Contrat contrat);
    List<Contrat> listContrats();
    Contrat getContratById(Long id);
    void deleteContrat(Long id);
}