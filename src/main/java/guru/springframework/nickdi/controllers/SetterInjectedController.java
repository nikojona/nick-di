package guru.springframework.nickdi.controllers;

import guru.springframework.nickdi.services.GreetingService;

public class SetterInjectedController {
	
	private GreetingService greetingService;

	public void setGreetingService(GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	public String getGreeting() {
		
		return greetingService.sayGreeting();
	}

}
