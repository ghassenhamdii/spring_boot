package tn.esprit.tic.project_spring_boot.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import tn.esprit.tic.project_spring_boot.entities.Contrat;
import tn.esprit.tic.project_spring_boot.entities.Equipe;
import tn.esprit.tic.project_spring_boot.repository.ContratRepository;
import tn.esprit.tic.project_spring_boot.repository.EquipeRepository;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class ContratSchedulerService {

    private final ContratRepository contratRepository;
    private final EquipeRepository equipeRepository;

    @Scheduled(fixedDelay = 30000)
    public void archiverContratsExpireesEtAffichageContratsActifsParEquipe() {

        String currentYear = String.valueOf(LocalDate.now().getYear());

        List<Contrat> tousLesContrats = contratRepository.findAll();

        // ARCHIVAGE
        for (Contrat contrat : tousLesContrats) {
            if (contrat.getAnnee() != null &&
                    Integer.parseInt(contrat.getAnnee()) < Integer.parseInt(currentYear)) {

                if (contrat.getArchived() == null || !contrat.getArchived()) {
                    contrat.setArchived(true);
                    contratRepository.save(contrat);
                }
            }
        }

        log.info("Contrats archivés avec succès");

        // CONTRATS ACTIFS
        List<Contrat> contratsActifs = tousLesContrats.stream()
                .filter(c -> c.getArchived() == null || !c.getArchived())
                .filter(c -> currentYear.equals(c.getAnnee()))
                .toList();

        List<Equipe> equipes = equipeRepository.findAll();

        for (Equipe equipe : equipes) {

            List<Contrat> contratsEquipe = contratsActifs.stream()
                    .filter(c -> c.getEquipe() != null &&
                            c.getEquipe().getIdEquipe().equals(equipe.getIdEquipe()))
                    .toList();

            if (!contratsEquipe.isEmpty()) {

                log.info("=== Equipe : {} ===", equipe.getLibelle());

                for (Contrat c : contratsEquipe) {
                    log.info("Contrat ID: {} | Montant: {} | Sponsor: {}",
                            c.getIdContrat(),
                            c.getMontant(),
                            c.getSponsor() != null ? c.getSponsor().getNom() : "N/A");
                }
            }
        }
    }
}