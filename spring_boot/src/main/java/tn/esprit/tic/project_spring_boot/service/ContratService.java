package tn.esprit.tic.project_spring_boot.service;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tic.project_spring_boot.repository.ContratRepository;
import tn.esprit.tic.project_spring_boot.entities.Contrat;
import java.util.List;

@Service
@AllArgsConstructor
public class ContratService implements IContratService {

    private final ContratRepository contratRepository;

    @Override
    public Contrat addContrat(Contrat contrat) {
        return contratRepository.save(contrat);
    }

    @Override
    public List<Contrat> listContrats() {
        return contratRepository.findAll();
    }

    @Override
    public Contrat getContratById(Long id) {
        return contratRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteContrat(Long id) {
        contratRepository.deleteById(id);
    }
}