package com.example.Demo.Model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.example.Demo.DTO.AddressBookDTO;

import lombok.Data;

@Entity
@Table(name = "Address_Book")
public @Data class AddressBookModel {

	public long AddressBookId;
	public String AddressBookName;
	
	@OneToMany(mappedBy = "addressmodel")
	public List<PersonModel> PersonList;
	
	
	public AddressBookModel(AddressBookDTO addressdto) {
		AddressBookName = addressdto.AddressBookName;
		PersonList = addressdto.list;
	}


	public AddressBookModel() {
	}
	
	
	
	
	
	
}
