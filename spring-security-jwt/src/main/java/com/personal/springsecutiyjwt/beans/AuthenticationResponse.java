package com.personal.springsecutiyjwt.beans;

public class AuthenticationResponse {
	
	private final String jwt;

	/**
	 * @return the jwt
	 */
	public String getJwt() {
		return jwt;
	}

	public AuthenticationResponse(String jwt) {
		super();
		this.jwt = jwt;
	}
	
	

}
