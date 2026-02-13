package tn.esprit.tic.project_spring_boot.Service;

import tn.esprit.tic.project_spring_boot.entities.Sponsor;
import java.util.List;

public interface ISponsorService {

    Sponsor ajouterSponsor(Sponsor sponsor);

    List<Sponsor> ajouterSponsors(List<Sponsor> sponsors);

    Sponsor modifierSponsor(Sponsor sponsor);

    void supprimerSponsor(Long idSponsor);

    List<Sponsor> listSponsors();

    Sponsor recupererSponsor(Long idSponsor);

    Boolean archiverSponsor(Long idSponsor);
}
