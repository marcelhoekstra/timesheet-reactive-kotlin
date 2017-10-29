package nl.quintor.reactivetimesheet.repository;

/**
 * @author Guido van der Zanden ($$Author: gvdzanden $$)
 * @version $$Revision: 209 $$ $$Date: 2014-04-21 18:57:09 +0200 (Mon, 21 Apr 2014) $$
 *          ${tags}
 */

import nl.quintor.reactivetimesheet.model.Medewerker;
import nl.quintor.reactivetimesheet.model.Verlof;
import nl.quintor.reactivetimesheet.model.VerlofType;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository("VerlofRepository")
public interface VerlofRepository extends CrudRepository<Verlof, Long> {
    @Query("select sum(v.uren) from Verlof v where v.medewerker = ?1 and v.jaar = ?2 and v.verlofType = ?3")
    Double findAantalVakantieUrenVoorMedewerkerInJaar(Medewerker medewerker, int jaar, VerlofType verlofType);
}
