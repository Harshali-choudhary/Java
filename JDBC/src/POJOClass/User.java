package POJOClass;

import java.sql.Date;
import java.time.LocalDate;

public class User {
	private int id;
	private String First_name;
	private String Last_name;
	private String Email;
	private String Password;
	private Date Dob;
	private boolean Status;
	private String role;
	public User(int id, String first_name, String last_name, String email, String password, Date dob,
			boolean status, String role) {
		super();
		this.id = id;
		First_name = first_name;
		Last_name = last_name;
		Email = email;
		Password = password;
		Dob = dob;
		Status = status;
		this.role = role;
	}
	
	
	public User(String first_name, String last_name, String email, String password, Date dob) {
		super();
		First_name = first_name;
		Last_name = last_name;
		Email = email;
		Password = password;
		Dob = dob;
		this.role = "voter";
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirst_name() {
		return First_name;
	}
	public void setFirst_name(String first_name) {
		First_name = first_name;
	}
	public String getLast_name() {
		return Last_name;
	}
	public void setLast_name(String last_name) {
		Last_name = last_name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public Date getDob() {
		return Dob;
	}
	public void setDob(Date dob) {
		Dob = dob;
	}
	public boolean getStatus() {
		return Status;
	}
	public void setStatus(boolean status) {
		Status = status;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", First_name=" + First_name + ", Last_name=" + Last_name + ", Email=" + Email
				+ ", Password=" + Password + ", Dob=" + Dob + ", Status=" + Status + ", role=" + role + "]";
	}
	
	

}
