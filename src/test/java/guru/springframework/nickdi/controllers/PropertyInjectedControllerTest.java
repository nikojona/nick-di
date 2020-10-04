package guru.springframework.nickdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import guru.springframework.nickdi.services.ConstructorGreetingService;

/**
 * This is the 1st test method
 * Manual testing using manual property injection from properties
 * Not recommended for manual testing
 */
class PropertyInjectedControllerTest {
	
	PropertyInjectedController controller;

	@BeforeEach
	void setUp() throws Exception {
		
		controller = new PropertyInjectedController();
		
		controller.greetingService = new ConstructorGreetingService();
	}

	@Test
	void getGreeting() {
		
		System.out.println(controller.getGreeting());
	}

}
