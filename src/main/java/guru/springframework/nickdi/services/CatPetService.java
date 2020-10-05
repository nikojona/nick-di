package guru.springframework.nickdi.services;

import org.springframework.stereotype.Service;

@Service("animal")
public class CatPetService implements PetService{

	@Override
	public String getPetType() {
		
		return "Cats are the best!";
	}
	
}
