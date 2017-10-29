package nl.quintor.reactivetimesheet.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "timesheet")
@Builder
@Data
@NoArgsConstructor(force = true)
@AllArgsConstructor
public class Timesheet extends AbstractTimesheetEntity {

    @ManyToOne()
    private Medewerker medewerker;
    @OneToMany(mappedBy = "timesheet", cascade = CascadeType.ALL)
    private List<KilometerRegistratie> kilometerRegistraties;

    @OneToMany(mappedBy = "timesheet", cascade = CascadeType.ALL)

    private List<ProjectBoeking> projectBoekingen = new ArrayList<>();
    @OneToMany(mappedBy = "timesheet", cascade = CascadeType.ALL)
    private Set<KilometerBoeking> kilometerBoekingen;
    private int jaar;
    private int maand;
    @Enumerated(EnumType.STRING)
    @Column(name = "timesheetstatus")
    private TimesheetStatus timesheetStatus;
    private String opmerking;

//    @Column(name = "lastModified")
//    @Temporal(TemporalType.TIMESTAMP)
//    private Date lastModified = new Date();
//
//    @PrePersist
//    @PreUpdate
//    @PostConstruct
//    protected void onCreateOrUpdate() {
//        lastModified = new Date();
//    }

}
