package nl.quintor.reactivetimesheet.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 */
@Entity
@Table(name="medewerker")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Medewerker extends AbstractTimesheetEntity {
    public static final int FULLTIME = 40;
    private String voorNaam;
	private String achterNaam;
	private String email;
	private String inlognaam;
	private String password;
	private int contractUren;
    private String partimeDagen;
	
	@Column(nullable = false)
	@Type(type = "org.hibernate.type.NumericBooleanType")
	private boolean actief;
	@OneToMany(mappedBy="medewerker", cascade= {CascadeType.ALL}, orphanRemoval=true)
	private List<Auto> autos = new ArrayList<>();

    @OneToMany(mappedBy="medewerker", fetch=FetchType.LAZY)
	private Set<Timesheet> timesheets = new HashSet<>();

    public boolean isPartime() {
        return this.contractUren > 0 && this.contractUren < FULLTIME;
    }
}
