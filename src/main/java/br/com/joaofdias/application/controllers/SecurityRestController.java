package br.com.joaofdias.application.controllers;

import java.security.Principal;

import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityRestController {

	@GetMapping("/public")
	public String getPublic( ) {
		return "Public 7";
	}
	
	@Secured("ROLE_ADMIN")
	@GetMapping("/protected")
	public String getProtected() {
		return "Protected 7";
	}
	
	@GetMapping("/userInfo")	
	public String getUserInfo(Principal principal) {
		return principal.getName();
	}
	
}
