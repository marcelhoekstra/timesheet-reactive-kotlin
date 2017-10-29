package nl.quintor.reactivetimesheet.web.rest.dto;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Value;

import java.util.Date;

/**
 * Data Transfer Object voor de boekingen
 * 
 */
@JsonAutoDetect
@JsonInclude(Include.NON_NULL)
@JsonTypeName("Boeking")
@Value
public class BoekingDto {
	private Long id;
    private Integer version;
	private double uren;
	private String opmerkingen;
	@JsonSerialize(using = JsonDateSerializer.class)
	private Date datum;
	private int kilometers;
}
