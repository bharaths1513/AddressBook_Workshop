package com.example.Demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Demo.DTO.PersonDTO;
import com.example.Demo.Model.AddressBookModel;
import com.example.Demo.Model.PersonModel;
import com.example.Demo.Repository.AddressBookRepository;
import com.example.Demo.Repository.PersonRepository;

@Service
public class PersonService implements IPersonService {

	@Autowired
	private PersonRepository personrepo;
	
	@Autowired
	private AddressBookRepository addressrepo;
	
	/**
	 * Creating Person data
	 * return : Data Saved 
	 */
//	@Override
//	public PersonModel addperson(PersonDTO persondto) {
//		PersonModel model = null;
//		model = new PersonModel(persondto);
//		return personrepo.save(model);
//	}
	
	/**
	 * Getting the Person Details By Id
	 * return : Person Data which is get by Id
	 */
	@Override
	public PersonModel GetPersonByID(long Id) {

				return personrepo.findById(Id).get();
		
		
	}
	
	/**
	 * Getting All Person Details
	 * return : All Person Details Which are Saved
	 */
	@Override
	public List<PersonModel> getPersons() {
		
		return personrepo.findAll();
	}
	
	/**
	 * updating the existing person
	 * return : Updated Person Data 
	 */
	@Override
	public PersonModel UpdatePerson(long Id, PersonDTO persondto) {
		PersonModel model = this.GetPersonByID(Id);
		model.UpdatePersonModel(persondto);
		return personrepo.save(model);
	}
	
	/**
	 * Deleting Person Data
	 * return : Deleted Id
	 */
	@Override
	public void deleteperson(long Id) {
		PersonModel model = this.GetPersonByID(Id);
		personrepo.delete(model);
		
	}

	@Override
	public PersonModel addperson(long addressId, PersonDTO persondto) {
		PersonModel model = null;
		model = new PersonModel(persondto);
		Optional<AddressBookModel> addressbook = addressrepo.findById(addressId);
		if(addressbook.isPresent());
		model.setAddressmodel(addressbook.get());
		return personrepo.save(model);
	}

}
