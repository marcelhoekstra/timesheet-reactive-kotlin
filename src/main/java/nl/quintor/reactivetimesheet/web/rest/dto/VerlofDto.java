package nl.quintor.reactivetimesheet.web.rest.dto;

import java.util.Date;

public class VerlofDto  {
    private long id;
    private double uren;
    private int jaar;
    private int maand;
    private Date datum;
    private String verlofType;
    private Long medewerkerId;

    public double getUren() {
        return uren;
    }

    public void setUren(double uren) {
        this.uren = uren;
    }

    public String getVerlofType() {
        return verlofType;
    }

    public void setVerlofType(String verlofType) {
        this.verlofType = verlofType;
    }

    public int getJaar() {
        return jaar;
    }

    public void setJaar(int jaar) {
        this.jaar = jaar;
    }

    public int getMaand() {
        return maand;
    }

    public void setMaand(int maand) {
        this.maand = maand;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public void setMedewerkerId(Long medewerkerId) {
        this.medewerkerId = medewerkerId;
    }

    public Long getMedewerkerId() {
        return medewerkerId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
