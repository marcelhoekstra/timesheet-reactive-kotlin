package nl.quintor.reactivetimesheet.repository;

import nl.quintor.reactivetimesheet.model.KilometerRegistratie;
import nl.quintor.reactivetimesheet.model.Medewerker;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Guido van der Zanden ($$Author: gvdzanden $$)
 * @version $$Revision: 173 $$ $$Date: 2013-12-10 23:00:01 +0100 (Tue, 10 Dec 2013) $$
 *          ${tags}
 */
@Repository("kilometerregistratie")
public interface KilometerRegistratieRepository extends CrudRepository<KilometerRegistratie, Long> {
    @Query("select kr from KilometerRegistratie kr " +
            "where kr.timesheet.jaar = ?2 and " +
            "kr.timesheet.medewerker = ?1 " +
            "order by kr.auto, kr.timesheet.maand")
    List<KilometerRegistratie> findKilometerRegistratiesInJaar(Medewerker medewerker, int jaar);

    @Query("select sum(kr.eindStand - kr.beginStand) from KilometerRegistratie kr " +
            "where kr.timesheet.jaar = ?2 and " +
            "kr.timesheet.medewerker = ?1 ")
    Long bepaalGeredenKilometersInJaar(Medewerker medewerker, int jaar);
}
