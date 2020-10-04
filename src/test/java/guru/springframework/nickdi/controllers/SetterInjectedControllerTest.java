package guru.springframework.nickdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import guru.springframework.nickdi.services.ConstructorGreetingService;

/**
 * This is the 2ndt test method
 * Manual testing using setter base controller
 * Not recommended for manual testing
 */
class SetterInjectedControllerTest {
	
	SetterInjectedController controller;
	
	@BeforeEach
	void setUp() throws Exception {
		
		controller = new SetterInjectedController();
		controller.setGreetingService(new ConstructorGreetingService());
		
	}

	@Test
	void getGreeting() {
		
		System.out.println(controller.getGreeting());;
		
	}

}
