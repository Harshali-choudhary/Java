package Entites;

public class Cricketer {
 private String name;
 private int age;
 private String Email_id;
 private String PhoneNo;
 private int rating;
 
 
 
public Cricketer(String email_id) {
	
	Email_id = email_id;
}


public Cricketer(String name, int age, String email_id, String phoneNo, int rating) {
	super();
	this.name = name;
	this.age = age;
	Email_id = email_id;
	PhoneNo = phoneNo;
	this.rating = rating;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public int getAge() {
	return age;
}


public void setAge(int age) {
	this.age = age;
}


public String getEmail_id() {
	return Email_id;
}


public void setEmail_id(String email_id) {
	Email_id = email_id;
}


public String getPhoneNo() {
	return PhoneNo;
}


public void setPhoneNo(String phoneNo) {
	PhoneNo = phoneNo;
}


public int getRating() {
	return rating;
}


public void setRating(int rating) {
	this.rating = rating;
}


@Override
public String toString() {
	return "Cricketer [name=" + name + ", age=" + age + ", Email_id=" + Email_id + ", PhoneNo=" + PhoneNo + ", rating="
			+ rating + "]";
}
 
 @Override
 public boolean equals(Object o)
 {
	 if(o instanceof Cricketer)
	 {
		 Cricketer c=(Cricketer)o;
		 return this.Email_id.equals(c.Email_id);
	 }
	 return false;
 }
}
