package com.example.Demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Demo.DTO.AddressBookDTO;
import com.example.Demo.DTO.ResponseDTO;
import com.example.Demo.Model.AddressBookModel;
import com.example.Demo.Model.PersonModel;
import com.example.Demo.Service.IAddressBookService;

@RestController
//@RequestMapping("/AddressBook")
public class AddressBookController {

	@Autowired
	private IAddressBookService service;
	
	@PostMapping("/AddAddress")
	public ResponseEntity<ResponseDTO> AddAddressBook(@RequestBody AddressBookDTO addressdto){
		AddressBookModel model = null;
		model = service.addaddressbook(addressdto);
		ResponseDTO respDTO = new ResponseDTO("Added AddressBook ", model);
		return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
	}
	
	@GetMapping("/FindAll")
	public ResponseEntity<ResponseDTO> GetAddress(){
		List<AddressBookModel> personlist = null;
		personlist = service.FindAllPersons();
		ResponseDTO respDTO = new ResponseDTO("Getting All Address Successfully: ",personlist);
		return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
	}
	
	
	@GetMapping("/Find/{Id}")
	public ResponseEntity<ResponseDTO> FindAddressById(@PathVariable("Id")long Id){
		AddressBookModel model = null;
		model = service.GetAddressBookById(Id);
		ResponseDTO respDTO = new ResponseDTO("Getting Address By Id Successful",model);
		return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
	}
	
	@DeleteMapping("/Delete/{Id}")
	public ResponseEntity<ResponseDTO> DeleteAddress(@PathVariable("Id") long Id){
		service.deleteAddressBook(Id);
		ResponseDTO respDTO = new ResponseDTO("AddressBook Deleted Successful: ",Id);
		return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
	}
}
