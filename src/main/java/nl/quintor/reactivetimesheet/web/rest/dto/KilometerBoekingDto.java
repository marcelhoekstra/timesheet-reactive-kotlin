package nl.quintor.reactivetimesheet.web.rest.dto;

import lombok.Value;

import java.util.Date;

@Value
public class KilometerBoekingDto {
	private Long id;
	private Integer version;
	private Date datum;
	private int kilometers;
}
