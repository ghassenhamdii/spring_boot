package tn.esprit.tic.project_spring_boot.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tic.project_spring_boot.entities.Pilote;
import tn.esprit.tic.project_spring_boot.entities.Position;
import tn.esprit.tic.project_spring_boot.repository.PiloteRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PiloteService implements IPiloteService {

    private final PiloteRepository pr;

    @Override
    public String addPilote(Pilote pilote) {
        pr.save(pilote);
        return "Pilote ajouté avec succès";
    }

    @Override
    public void updatePilotRankings() {

        List<Pilote> pilotes = pr.findAll();

        // calcul points depuis positions
        for (Pilote p : pilotes) {

            int points = p.getPositions() != null ?
                    p.getPositions().stream()
                            .mapToInt(Position::getNbPoints)
                            .sum()
                    : 0;

            p.setNbPointsTotal(points);
        }

        // tri
        pilotes.sort((p1, p2) ->
                Integer.compare(
                        p2.getNbPointsTotal() != null ? p2.getNbPointsTotal() : 0,
                        p1.getNbPointsTotal() != null ? p1.getNbPointsTotal() : 0
                )
        );

        // classement
        int rank = 1;

        for (Pilote p : pilotes) {
            p.setClassementGeneral(rank++);
            pr.save(p);
        }
    }
}