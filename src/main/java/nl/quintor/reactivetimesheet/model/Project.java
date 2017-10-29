package nl.quintor.reactivetimesheet.model;

import lombok.Data;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.Date;

/**
 * Project waarvoor activiteiten gedefinieerd worden voor een medewerker
 */
@Entity
@Table(name = "project")
@Data
public class Project extends AbstractTimesheetEntity {

    private String naam;
    @Type(type = "org.hibernate.type.NumericBooleanType")
    private boolean standaard;
    @Column
    @Temporal(TemporalType.DATE)
    private Date beginDatum;
    @Column
    @Temporal(TemporalType.DATE)
    private Date eindDatum;
}
