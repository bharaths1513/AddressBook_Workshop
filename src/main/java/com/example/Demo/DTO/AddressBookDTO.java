package com.example.Demo.DTO;


import javax.validation.constraints.Pattern;

//import java.util.List;
//
//import com.example.Demo.Model.PersonModel;

import lombok.ToString;

public @ToString class AddressBookDTO {

//	public Long AddressBookId;
	
	@Pattern(regexp = "^[A-Z]{1}[a-zA-Z]{2,}$",message = "AddressBook name is Invalid")
	public String AddressBookName;
//	public List<PersonModel> list;
	
}
