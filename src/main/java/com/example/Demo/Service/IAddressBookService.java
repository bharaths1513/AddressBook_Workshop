package com.example.Demo.Service;

import org.springframework.stereotype.Service;

import com.example.Demo.DTO.AddressBookDTO;
import com.example.Demo.Model.AddressBookModel;

@Service
public interface IAddressBookService {

	AddressBookModel addaddressbook(AddressBookDTO addressdto);
}
