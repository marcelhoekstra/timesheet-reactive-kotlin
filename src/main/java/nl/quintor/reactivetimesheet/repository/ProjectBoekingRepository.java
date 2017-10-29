package nl.quintor.reactivetimesheet.repository;

import nl.quintor.reactivetimesheet.model.ProjectBoeking;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository("ProjectBoekingRepository")
public interface ProjectBoekingRepository extends CrudRepository<ProjectBoeking, Long> {
	
}
