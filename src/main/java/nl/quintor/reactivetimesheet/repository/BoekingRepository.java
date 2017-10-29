package nl.quintor.reactivetimesheet.repository;

import nl.quintor.reactivetimesheet.model.Medewerker;
import nl.quintor.reactivetimesheet.model.Project;
import nl.quintor.reactivetimesheet.model.UrenBoeking;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository("BoekingRepository")
public interface BoekingRepository extends CrudRepository<UrenBoeking, Long> {
    @Query("select sum (ub.uren) " +
            "from UrenBoeking ub " +
            "where ub.projectBoeking.project = ?1 and " +
            "ub.projectBoeking.timesheet.medewerker = ?2 and " +
            "ub.projectBoeking.timesheet.jaar = ?3")
    Double findGeboekteUrenOpProjectInJaarVoorMedewerker(Project project, Medewerker medewerker, int jaar);
}