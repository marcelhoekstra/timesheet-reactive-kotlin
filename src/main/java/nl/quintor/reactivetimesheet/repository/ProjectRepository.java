package nl.quintor.reactivetimesheet.repository;


import nl.quintor.reactivetimesheet.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("ProjectRepository")
public interface ProjectRepository extends JpaRepository<Project, Long> {
    Project findProjectByNaam(String naam);
}
