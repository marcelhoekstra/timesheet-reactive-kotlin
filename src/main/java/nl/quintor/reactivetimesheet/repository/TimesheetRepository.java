package nl.quintor.reactivetimesheet.repository;

import nl.quintor.reactivetimesheet.model.Timesheet;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * Created with IntelliJ IDEA.
 * User: marcel
 * Date: 17-9-13
 * Time: 20:29
 * To change this template use File | Settings | File Templates.
 */
@Repository("TimesheetRepository")
public interface TimesheetRepository extends CrudRepository<Timesheet, Long> {
    Timesheet findByMedewerkerIdAndJaarAndMaand(Long medewerkerId, int jaar, int maand);

    List<Timesheet> findAll();

//    @Query("select t from Timesheet t")
//    Iterable<Timesheet> findAll();
}
