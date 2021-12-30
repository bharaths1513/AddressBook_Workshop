package com.example.Demo.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Demo.DTO.PersonDTO;
import com.example.Demo.Model.PersonModel;

@Service
public interface IPersonService {

	PersonModel addperson(PersonDTO persondto);
	PersonModel GetPersonByID(long Id);
	List<PersonModel> getPersons();
	PersonModel UpdatePerson(PersonDTO persondto);
	void deleteperson(long Id);
	
}
