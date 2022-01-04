package com.example.Demo.DTO;



import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import lombok.ToString;

public @ToString class PersonDTO {

	public long Id;
	
	@Pattern(regexp = "^[A-Z]{1}[a-zA-Z]{2,}$",message = "First name is Invalid")
	@NotEmpty(message="Person First name cannot be null")
	public String FirstName;
	
	@Pattern(regexp = "^[A-Z]{1}[a-zA-Z]{1,}$",message = "Last name is Invalid")
	@NotEmpty(message="Person Last name cannot be null")
	public String LastName;
	
	@Pattern(regexp = "male|female", message = "Gender needs to be male or female")
	public String Gender;
	
//	@Pattern(regexp = "^[0-9]{2}\\s{1}[0-9]{10}$", message = "Given number is invalid invalid")	
	public long PhoneNumber;
	
	@Pattern(regexp ="^[a-z0-9]{3,}+([_+-.][a-z0-9]{3,}+)*@[a-z0-9]+.[a-z]{2,3}?(.[a-z]{2,3}){0,1}$",message=" Enter valid mail Id")
	@NotEmpty(message="Person Email Id cannot be null")
	public String Email;
	
	@NotEmpty(message="Person City cannot be null")
	public String City;
	
	@NotEmpty(message="Person State cannot be null")
	public String State;
	
	@NotEmpty(message="Person Country cannot be null")
	public String Country;
	
	@NotEmpty(message="Person Address cannot be null")
	public String Address;
	
	@NotEmpty(message="Person ProfilePic cannot be null")
	public String Profilepic;
}
