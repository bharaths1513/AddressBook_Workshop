package com.example.Demo.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Demo.DTO.AddressBookDTO;
import com.example.Demo.DTO.PersonDTO;
import com.example.Demo.Model.AddressBookModel;
import com.example.Demo.Model.PersonModel;

@Service
public interface IAddressBookService {

	AddressBookModel addaddressbook(AddressBookDTO addressdto);
	List<AddressBookModel> FindAllPersons();
	AddressBookModel GetAddressBookById(long Id);
	void deleteAddressBook(long Id);
//	AddressBookModel UpdatePerson(long Id,AddressBookDTO addressdto);
}
