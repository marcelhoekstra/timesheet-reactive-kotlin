package nl.quintor.reactivetimesheet.model;

import lombok.Data;

import javax.annotation.PostConstruct;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="urenboeking")
@Data
public class UrenBoeking extends AbstractTimesheetEntity {
	@Temporal(TemporalType.DATE)
	private Date datum;
	private Date mutatieDatum;
	private double uren;
	private String opmerking;
	private int kilometers;

	@PrePersist
	@PreUpdate
	@PostConstruct
	protected void onCreateOrUpdate() {
		mutatieDatum = new Date();
	}

	@ManyToOne()
	private ProjectBoeking projectBoeking;

	@Enumerated(EnumType.STRING)
	private KilometerType kilometerType = KilometerType.FORFAITAIR;

}
	

