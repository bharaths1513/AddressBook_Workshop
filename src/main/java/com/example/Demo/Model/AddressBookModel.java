package com.example.Demo.Model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.example.Demo.DTO.AddressBookDTO;

import lombok.Data;

@Entity
@Table(name = "Address_Book")
public @Data class AddressBookModel {

	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	public long AddressBookId;
	public String AddressBookName;
	
//	@OneToMany(targetEntity = PersonModel.class, cascade = CascadeType.ALL)
//	@JoinColumn(name = "id", referencedColumnName = "id")
//	public List<PersonModel> PersonList;
	
	public AddressBookModel(AddressBookDTO addressdto) {
		AddressBookName = addressdto.AddressBookName;
		AddressBookId = addressdto.AddressBookId;
//		PersonList = addressdto.list;
	}


	public AddressBookModel() {
	}
	
	
	
	
	
	
}
