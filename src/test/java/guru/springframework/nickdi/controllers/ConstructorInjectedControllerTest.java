package guru.springframework.nickdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import guru.springframework.nickdi.services.ConstructorGreetingService;

/**
 * This is the 3th test method
 * Manual testing using constructor injection
 * Recommended for manual testing
 */
class ConstructorInjectedControllerTest {

	ConstructorInjectedController controller;
	
	@BeforeEach
	void setUp() throws Exception {
		controller = new ConstructorInjectedController(new ConstructorGreetingService());
	}

	@Test
	void test() {
		
		System.out.println(controller.getGreeting());
	}

}
