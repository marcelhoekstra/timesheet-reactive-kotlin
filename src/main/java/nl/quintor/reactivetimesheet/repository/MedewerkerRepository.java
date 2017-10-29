package nl.quintor.reactivetimesheet.repository;


import nl.quintor.reactivetimesheet.model.Medewerker;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository("MedewerkerRepository")
public interface MedewerkerRepository extends CrudRepository<Medewerker, Long> {
	@Query("SELECT m FROM Medewerker m WHERE m.inlognaam = ?1")
	Medewerker findByInlognaam(String inlognaam);
}
