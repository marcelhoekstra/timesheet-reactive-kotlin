package nl.quintor.reactivetimesheet.web.rest.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Value;

import java.util.Date;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Value
@Builder
public class AutoDto  {
    private Long id;
    private int version;
	private String kenteken;
	private boolean vervangendVervoer;
	private Date beginDatum;
	private Date eindDatum;
	private MedewerkerDto medewerker;
}