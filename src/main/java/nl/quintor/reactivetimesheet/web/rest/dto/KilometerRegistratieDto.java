package nl.quintor.reactivetimesheet.web.rest.dto;


import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class KilometerRegistratieDto {
	private Long id;
	private Integer version;
	private AutoDto auto;
	private TimesheetDto timesheet;
	private int beginStand;
	private int eindStand;
}
