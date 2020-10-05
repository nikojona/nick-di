package guru.springframework.nickdi.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import guru.springframework.nickdi.services.PetService;

@Controller
public class PetController {
	
	private final PetService petService;
	
	public PetController(@Qualifier("animal") PetService petService) {
		this.petService = petService;
	}

	public String wichPetIsTheBest() {
		
		return petService.getPetType();
	}
}
