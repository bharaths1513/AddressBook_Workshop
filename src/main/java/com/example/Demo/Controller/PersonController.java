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
import org.springframework.web.bind.annotation.RestController;

import com.example.Demo.DTO.PersonDTO;
import com.example.Demo.DTO.ResponseDTO;
import com.example.Demo.Model.PersonModel;
import com.example.Demo.Service.IPersonService;

@RestController
@RequestMapping("/AddressBook")
public class PersonController {

	@Autowired
	private IPersonService service;
	
	@PostMapping("/Add")
	public ResponseEntity<ResponseDTO> AddPerson(@RequestBody PersonDTO persondto){
		PersonModel model = null;
		model = service.addperson(persondto);
		ResponseDTO respDTO = new ResponseDTO("Added Person ", model);
		return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
	}
	
	@GetMapping("/FindAll")
	public ResponseEntity<ResponseDTO> GetAddress(){
		List<PersonModel> personlist = null;
		personlist = service.getPersons();
		ResponseDTO respDTO = new ResponseDTO("Getting All Address Successfully: ",personlist);
		return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
	}
	
	@GetMapping("/Find/{Id}")
	public ResponseEntity<ResponseDTO> FindAddressById(@PathVariable("Id")long Id){
		PersonModel model = null;
		model = service.GetPersonByID(Id);
		ResponseDTO respDTO = new ResponseDTO("Getting Address By Id Successful",model);
		return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
	}
	
	@PutMapping("/Update/{Id}")
	public ResponseEntity<ResponseDTO> UpdateAddress(@PathVariable("Id") long Id,  
			@RequestBody PersonDTO persondto){
		PersonModel model = null;
		model = service.UpdatePerson(Id, persondto);
		ResponseDTO respDTO = new ResponseDTO("Updating Address Successful",model);
		return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
	}
	
	@DeleteMapping("/Delete/{Id}")
	public ResponseEntity<ResponseDTO> DeleteAddress(@PathVariable("Id") long Id){
		service.deleteperson(Id);
		ResponseDTO respDTO = new ResponseDTO("Deleting Address Successful: ",Id);
		return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
	}
}
