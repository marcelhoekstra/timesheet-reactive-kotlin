package nl.quintor.reactivetimesheet.model;

import lombok.Value;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="kilometerregistratie")
@Value
public class KilometerRegistratie extends AbstractTimesheetEntity {
	@ManyToOne (cascade=CascadeType.REFRESH, fetch=FetchType.LAZY)
	private Auto auto;
	@ManyToOne (cascade=CascadeType.REFRESH, fetch=FetchType.LAZY)
	private Timesheet timesheet;
	private int beginStand;
	private int eindStand;
}
