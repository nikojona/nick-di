package guru.springframework.nickdi.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {
	
	public String sayHello () {
		
		System.out.println("Hello wolrd");
		
		return "Hi Folks!";
	}
}
