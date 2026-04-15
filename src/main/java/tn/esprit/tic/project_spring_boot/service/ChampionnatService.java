
package tn.esprit.tic.project_spring_boot.service;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tic.project_spring_boot.repository.ChampionnatRepository;
import tn.esprit.tic.project_spring_boot.entities.Championnat;

@Service
@AllArgsConstructor
public class ChampionnatService implements IChampionnatService{
    ChampionnatRepository championnatRepository;

    @Override
    public Championnat ajouterChampionnat(Championnat championnat) {
        return championnatRepository.save(championnat);
    }
}
