package nl.quintor.reactivetimesheet.web.rest.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.Value;

import java.util.Set;

@JsonInclude(Include.NON_NULL)
@JsonTypeName("ProjectBoeking")
@Value
public class ProjectBoekingDto {
	private Long id;
    private Integer version;
    private ProjectDto project;
    private Set<BoekingDto> urenBoekingen;

}
