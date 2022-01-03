package com.example.Demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Demo.DTO.AddressBookDTO;
import com.example.Demo.Model.AddressBookModel;
import com.example.Demo.Repository.AddressBookRepository;

@Service
public class AddressBookService implements IAddressBookService {

	@Autowired
	private AddressBookRepository addressrepo;

	@Override
	public AddressBookModel addaddressbook(AddressBookDTO addressdto) {
		AddressBookModel model =null;
		model = new AddressBookModel(addressdto);
		return addressrepo.save(model);
	}
		
}
