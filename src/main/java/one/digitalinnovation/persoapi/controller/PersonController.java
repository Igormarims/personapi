package one.digitalinnovation.persoapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import one.digitalinnovation.persoapi.model.Person;
import one.digitalinnovation.persoapi.model.DTO.MenssageResponseDTO;
import one.digitalinnovation.persoapi.repository.PersonRepository;

@RestController
@RequestMapping("/api/v1/people")
public class PersonController {
	
	
	private PersonRepository personRepository;
	
	
	@Autowired
	public PersonController(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}



	@PostMapping
	public MenssageResponseDTO createPerson(@RequestBody Person person  ) {
	Person savePerson	=personRepository.save(person);
		return MenssageResponseDTO.builder().message("Created person with ID " + savePerson.getId()).build();
	}
	
	
	
}
