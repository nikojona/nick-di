package guru.springframework.nickdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"ID", "default"})
@Service("i18nService")
public class I18NIndonesiaGreetingService implements GreetingService {

	@Override
	public String sayGreeting() {
		
		return "Halo dunia - ID";
	}
	
	
}
