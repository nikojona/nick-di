package guru.springframework.nickdi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SetterInjectedGreetingService implements GreetingService {
	
	@Autowired
	public String sayGreeting() {
		
		return "Hello world - Setter";
	}
}
