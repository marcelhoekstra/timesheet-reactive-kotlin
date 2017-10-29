package nl.quintor.reactivetimesheet.web.rest.dto;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.Data;

import java.util.Date;

@JsonAutoDetect
@JsonInclude(Include.NON_NULL)
@JsonTypeName("Project")
@Data
public class ProjectDto {
	private String naam;
    private boolean standaard;
    private Date beginDatum;
    private Date eindDatum;
}
