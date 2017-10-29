package nl.quintor.reactivetimesheet.repository;

import nl.quintor.reactivetimesheet.model.Auto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AutoRepository extends CrudRepository<Auto, Long> {

}
