package nl.quintor.reactivetimesheet.web.rest.dto;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@JsonAutoDetect
@JsonTypeName("Medewerker")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MedewerkerDto {
	private String voorNaam;
	private String achterNaam;
	private String email;
	private String inlognaam;
	private int contractUren;
	private boolean actief;
	private Integer version;
	private Long id;
    private String password;

	private List<AutoDto> autos;
    private String partimeDagen;

}