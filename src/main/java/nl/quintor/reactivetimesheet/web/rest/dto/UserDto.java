package nl.quintor.reactivetimesheet.web.rest.dto;

import java.util.Map;


public class UserDto {

	private final String name;

	private final Map<String, Boolean> roles;

	private final String token;
	private MedewerkerDto medewerker;


	public MedewerkerDto getMedewerker() {
		return medewerker;
	}


	public void setMedewerker(MedewerkerDto medewerker) {
		this.medewerker = medewerker;
	}


	public UserDto(String userName, Map<String, Boolean> roles, String token) {

		this.name = userName;
		this.roles = roles;
		this.token = token;
	}


	public String getName() {

		return this.name;
	}


	public Map<String, Boolean> getRoles() {

		return this.roles;
	}


	public String getToken() {

		return this.token;
	}

}
