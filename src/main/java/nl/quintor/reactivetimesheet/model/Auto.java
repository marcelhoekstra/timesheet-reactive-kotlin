package nl.quintor.reactivetimesheet.model;

import lombok.Value;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "auto")
@Value
public class Auto extends AbstractTimesheetEntity {
    private String kenteken;
    @Type(type = "org.hibernate.type.NumericBooleanType")
    private boolean vervangendVervoer;
    @Column
    @Temporal(TemporalType.DATE)
    private Date beginDatum;
    @Column
    @Temporal(TemporalType.DATE)
    private Date eindDatum;

    @ManyToOne
    private Medewerker medewerker;
}
