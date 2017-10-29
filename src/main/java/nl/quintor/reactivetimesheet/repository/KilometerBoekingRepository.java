package nl.quintor.reactivetimesheet.repository;

import nl.quintor.reactivetimesheet.model.KilometerBoeking;
import nl.quintor.reactivetimesheet.model.Medewerker;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Guido van der Zanden ($$Author: gvdzanden $$)
 * @version $$Revision: 173 $$ $$Date: 2013-12-10 23:00:01 +0100 (Tue, 10 Dec 2013) $$
 *          ${tags}
 */
@Repository("KilometerBoeking")
public interface KilometerBoekingRepository extends CrudRepository<KilometerBoeking, Long> {
    @Query("select sum (kb.kilometers) " +
            "from KilometerBoeking kb " +
            "where kb.timesheet.medewerker = ?1 and " +
            "kb.timesheet.jaar = ?2")
    Long findGeboekteKilometersInJaarVoorMedewerker(Medewerker medewerker, int jaar);
}
