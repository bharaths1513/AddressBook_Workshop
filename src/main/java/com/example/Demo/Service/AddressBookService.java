package com.example.Demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Demo.DTO.AddressBookDTO;
import com.example.Demo.Model.AddressBookModel;
import com.example.Demo.Model.PersonModel;
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

	@Override
	public List<AddressBookModel> FindAllPersons() {
		
		return addressrepo.findAll();
	}

	@Override
	public AddressBookModel GetAddressBookById(long Id) {
		return addressrepo.findById(Id).get();
	}

	@Override
	public void deleteAddressBook(long Id) {
		AddressBookModel model = this.GetAddressBookById(Id);
		addressrepo.delete(model);
		
	}
		
}
