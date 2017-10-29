package nl.quintor.reactivetimesheet.model;

import lombok.Value;

import javax.persistence.*;
import java.util.Set;


/**
 * Project waarvoor activiteiten gedefinieerd worden voor een medewerker
 */
@Entity
@Table(name = "projectboeking")
@Value
public class ProjectBoeking extends AbstractTimesheetEntity {
    @ManyToOne
    private Timesheet timesheet;

    @OneToMany(mappedBy = "projectBoeking", cascade = CascadeType.ALL)
    private Set<UrenBoeking> urenBoekingen;

    @OneToOne(cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    private Project project;
}
