package com.example.Demo.Model;

import com.example.Demo.DTO.PersonDTO;

import lombok.ToString;

public @ToString class PersonModel {

	public long Id;
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
}
