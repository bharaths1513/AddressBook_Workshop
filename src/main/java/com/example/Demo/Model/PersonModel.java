package com.example.Demo.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.example.Demo.DTO.PersonDTO;

import lombok.Data;

@Entity
@Table(name = "address_book")
public @Data class PersonModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Address_Id")
	public long Id;
	
	@Column(name="name")
	public String FirstName;
	public String LastName;
	public String Gender;
	public long PhoneNumber;
	public String Email;
	public String City;
	public String State;
	public String Country;
	public String Address;
	public String Profilepic;

	public PersonModel(PersonDTO persondto) {
		Id = persondto.Id;
		FirstName = persondto.FirstName;
		LastName = persondto.LastName;
		Gender = persondto.Gender;
		PhoneNumber = persondto.PhoneNumber;
		Email = persondto.Email;
		City = persondto.City;
		State = persondto.State;
		Country = persondto.Country;
		Address = persondto.Address;
		Profilepic = persondto.Profilepic;
	}

	public void UpdatePerson(PersonDTO persondto) {
		this.UpdatePerson(persondto);
	}

	public PersonModel() {
	}
}
