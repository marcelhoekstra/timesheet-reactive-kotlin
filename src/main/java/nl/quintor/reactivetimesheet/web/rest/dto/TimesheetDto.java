package nl.quintor.reactivetimesheet.web.rest.dto;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import nl.quintor.reactivetimesheet.model.TimesheetStatus;

import java.util.List;
import java.util.Set;

@Data
@Builder
@Getter
@Setter
public class TimesheetDto {
    private Long id;
    private Integer version;
    private int jaar;
    private int maand;
    private String opmerking;
    private TimesheetStatus status;
    private MedewerkerDto medewerker;
    private List<KilometerRegistratieDto> kilometerRegistraties;
    private Set<KilometerBoekingDto> kilometerBoekingen;
    private String partimeDagen;
}
