package com.example.Demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Demo.DTO.PersonDTO;
import com.example.Demo.DTO.ResponseDTO;
import com.example.Demo.Model.PersonModel;
import com.example.Demo.Service.IPersonService;

@RestController
@RequestMapping("/Person")
public class PersonController {

	@Autowired
	private IPersonService service;
	
	/**
	 * Adding person to AddressBook
	 * @param persondto
	 * @return : Person Data Which is Added
	 */
	
	@PostMapping("/Add")
	public ResponseEntity<ResponseDTO> AddPerson(@RequestParam long addressId, @RequestBody PersonDTO persondto){
		PersonModel model = null;
		model = service.addperson(addressId,persondto);
		ResponseDTO respDTO = new ResponseDTO("Added Person ", model);
		return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
	}
	
	/**
	 * Finding All Data Which is Added
	 * @return : List of Persons Data
	 */
	
	@GetMapping("/FindAll")
	public ResponseEntity<ResponseDTO> GetAddress(@RequestParam long addressId){
		List<PersonModel> personlist = null;
		personlist = service.getPersons();
		ResponseDTO respDTO = new ResponseDTO("Getting All Address Successfully: ",personlist);
		return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
	}
	
	
	/**
	 * Finding Person Data With Id
	 * @param Id
	 * @return : Data Which is Found By Id
	 */
	
	@GetMapping("/Find/{Id}")
	public ResponseEntity<ResponseDTO> FindAddressById(@PathVariable("Id")long Id,@RequestParam long addressId){
		PersonModel model = null;
		model = service.GetPersonByID(Id);
		ResponseDTO respDTO = new ResponseDTO("Getting Address By Id Successful",model);
		return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
	}
	
	/**
	 * Updating the Person Data with Id
	 * @param Id : Passed as Path Variable 
	 * @param persondto 
	 * @return : Updated Person Data
	 */
	
	@PutMapping("/Update/{Id}")
	public ResponseEntity<ResponseDTO> UpdateAddress(@PathVariable("Id") long Id,  
			@RequestBody PersonDTO persondto,@RequestParam long addressId){
		PersonModel model = null;
		model = service.UpdatePerson(Id, persondto);
		System.out.println(model);
		ResponseDTO respDTO = new ResponseDTO("Updating Address Successful",model);
		return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
	}
	
	/**
	 * Deleting The Person Data By Id
	 * @param Id
	 * @return : Deleted Person Id
	 */
	
	@DeleteMapping("/Delete/{Id}")
	public ResponseEntity<ResponseDTO> DeleteAddress(@PathVariable("Id") long Id,@RequestParam long addressId){
		service.deleteperson(Id);
		ResponseDTO respDTO = new ResponseDTO("Deleting Address Successful: ",Id);
		return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
	}
}
