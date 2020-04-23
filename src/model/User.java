package model;
import java.time.LocalDateTime;

public class User {
	String email;
	String password;
	LocalDateTime date;
	
	//Constructor
	public User (String email, String password, LocalDateTime date) {
		this.email = email;
		this.password = password;
		this.date = date;
	}

	//Get User email
	public String getEmail() {
		return email;
	}
	
	//Set User email
	public void setEmail(String email) {
		this.email = email;
	}

	//Get User password
	public String getPassword() {
		return password;
	}
	
	//Set User password
	public void setPassword(String password) {
		this.password = password;
	}
	
	//Get date
	public LocalDateTime getDate() {
		return date;
	}
	
	//Set date
	public void setDate(LocalDateTime date) {
		this.date = date;
	}
	
}

