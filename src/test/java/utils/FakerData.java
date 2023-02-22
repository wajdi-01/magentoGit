package utils;

import com.github.javafaker.Faker;

public class FakerData {

	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String ConfirmPassword;
    
	Faker fackObject = new Faker(); 
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
		fackObject.address().firstName();
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
		fackObject.address().lastName();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
		fackObject.internet().emailAddress();
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
		fackObject.internet().password();
	}

	public String getConfirmPassword() {
		return ConfirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		ConfirmPassword = confirmPassword;
		fackObject.letterify(password);
	}
 }
