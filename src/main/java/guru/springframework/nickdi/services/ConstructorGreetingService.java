package guru.springframework.nickdi.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService {
	
	@Override
	public String sayGreeting() {
		
		return "Hello World - Constructor";
	}
}
