package com.ybouslim.positiveImpactAPI.authentication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicAuthController {

	@GetMapping(path="/basicauth")
	public Authentication authenticate() {
		return new Authentication("Vous voilà connecté !");
		//FIXME : Pourquoi une classe Authentication ?
	}
	
}
