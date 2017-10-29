package nl.quintor.reactivetimesheet.model;

import lombok.Data;
import lombok.Value;

import java.util.Date;

import javax.annotation.PostConstruct;
import javax.persistence.*;

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


    public Date getDatum() {
		return datum;
	}
	public void setDatum(Date datum) {
		this.datum = datum;
	}
	
	public String getOpmerking() {
		return opmerking;
	}
	public void setOpmerking(String opmerking) {
		this.opmerking = opmerking;
	}
	public Date getMutatieDatum() {
		return mutatieDatum;
	}
	public void setMutatieDatum(Date mutatieDatum) {
		this.mutatieDatum = mutatieDatum;
	}
	public double getUren() {
		return uren;
	}
	public void setUren(double uren) {
		this.uren = uren;
	}
	public int getKilometers() {
		return kilometers;
	}
	public void setKilometers(int kilometers) {
		this.kilometers = kilometers;
	}
	public KilometerType getKilometerType() {
		return kilometerType;
	}
	public void setKilometerType(KilometerType kilometerType) {
		this.kilometerType = kilometerType;
	}

    public ProjectBoeking getProjectBoeking() {
        return projectBoeking;
    }

    public void setProjectBoeking(ProjectBoeking projectBoeking) {
        this.projectBoeking = projectBoeking;
    }
}
	

