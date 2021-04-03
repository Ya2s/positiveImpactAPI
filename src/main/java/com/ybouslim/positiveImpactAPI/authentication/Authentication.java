package com.ybouslim.positiveImpactAPI.authentication;

import lombok.Data;

@Data
public class Authentication {
	
	private String message;

	public Authentication(String message) {
		this.message = message;
	}
	
}
