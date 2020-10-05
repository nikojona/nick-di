package guru.springframework.nickdi.controllers;

import org.springframework.stereotype.Controller;

import guru.springframework.nickdi.services.GreetingService;

@Controller
public class MyController {
	
//	Refactor the controller
	private final GreetingService greetingService;
	
	public MyController(GreetingService greetingService) {

		this.greetingService = greetingService;
	}

	public String sayHello () {
		
		System.out.println("Hello world");
		
		return "Hi Folks!";
	}
	
	public String sayHelloWithBean() {
		
		return greetingService.sayGreeting();
	}
}
