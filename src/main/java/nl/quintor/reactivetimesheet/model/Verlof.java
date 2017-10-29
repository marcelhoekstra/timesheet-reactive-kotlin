package nl.quintor.reactivetimesheet.model;

import lombok.Value;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

/**
 * In de tabel Verlof worden verlofuren geboekt die medewerker kan opmaken. De verlofuren kunnen bestaan uit standaard
 * vakantieuren, opgespaarde uren uit eerdere jaren en overuren.
 *
 * @author Guido van der Zanden ($$Author: gvdzanden $$)
 * @version $$Revision: 214 $$ $$Date: 2014-04-21 21:18:46 +0200 (Mon, 21 Apr 2014) $$
 *          ${tags}
 */
@Entity
@Table(name = "verlof")
@Value
public class Verlof extends AbstractTimesheetEntity {

    /** Het aantal uren verlof. */
    @Column(nullable = false)
    private double uren;

    /** Het jaar waarin de uren geldig zijn. */
    @Column(nullable = false)
    private int jaar;

    @Column(nullable = true)
    private int maand;

    /** De datum waarop de uren bijgeboekt zijn. */
    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date datum;

    /** Het type verlofuren. */
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private VerlofType verlofType;

    /** De medewerker waarvan de verlofuren zijn. */
    @ManyToOne(optional = false)
    private Medewerker medewerker;


}
