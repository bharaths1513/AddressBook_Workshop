package com.example.Demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Demo.DTO.AddressBookDTO;
import com.example.Demo.DTO.ResponseDTO;
import com.example.Demo.Model.AddressBookModel;
import com.example.Demo.Service.IAddressBookService;

@RestController
@RequestMapping("/Address")
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
}
