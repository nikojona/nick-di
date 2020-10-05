package guru.springframework.nickdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("cat")
@Service("animal")
public class CatPetService implements PetService{

	@Override
	public String getPetType() {
		
		return "Cats are the best!";
	}
	
}
