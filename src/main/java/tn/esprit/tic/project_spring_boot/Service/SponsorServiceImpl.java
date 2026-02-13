package tn.esprit.tic.project_spring_boot.Service;


import tn.esprit.tic.project_spring_boot.Repository.SponsorRepository;
import tn.esprit.tic.project_spring_boot.entities.Sponsor;

import java.time.LocalDate;
import java.util.List;


public class SponsorServiceImpl implements ISponsorService {

    SponsorRepository sponsorRepository;

    // CREATE 1
    @Override
    public Sponsor ajouterSponsor(Sponsor sponsor) {
        sponsor.setDateCreation(LocalDate.now());
        sponsor.setArchived(false);
        sponsor.setBloquerContrat(false);
        return sponsorRepository.save(sponsor);
    }

    // CREATE LIST
    @Override
    public List<Sponsor> ajouterSponsors(List<Sponsor> sponsors) {

        for (Sponsor s : sponsors) {
            s.setDateCreation(LocalDate.now());
            s.setArchived(false);
            s.setBloquerContrat(false);
        }

        return sponsorRepository.saveAll(sponsors);
    }

    // UPDATE
    @Override
    public Sponsor modifierSponsor(Sponsor sponsor) {
        sponsor.setDateDerniereModification(LocalDate.now());
        return sponsorRepository.save(sponsor);
    }

    // DELETE
    @Override
    public void supprimerSponsor(Long idSponsor) {
        sponsorRepository.deleteById(idSponsor);
    }

    // READ ALL
    @Override
    public List<Sponsor> listSponsors() {
        return sponsorRepository.findAll();
    }

    // READ ONE
    @Override
    public Sponsor recupererSponsor(Long idSponsor) {
        return sponsorRepository.findById(idSponsor).orElse(null);
    }

    // ARCHIVE
    @Override
    public Boolean archiverSponsor(Long idSponsor) {
        Sponsor s = sponsorRepository.findById(idSponsor).orElse(null);

        if (s == null)
            return false;

        s.setArchived(true);
        sponsorRepository.save(s);
        return true;
    }
}
