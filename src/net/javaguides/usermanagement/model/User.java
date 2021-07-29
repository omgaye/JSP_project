package net.javaguides.usermanagement.model;

public class User {
	protected int id;
	protected String name;
	protected String email;
	protected String password;
	protected int number;
	protected String address;
	protected String course;
	
	public User() {
	}
	
	public User(String name, String email, String password, int number, String address, String course) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.number = number;
		this.address = address;
		this.course = course;
	}

	public User(int id, String name, String email, String password, int number, String address, String course) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.number = number;
		this.address = address;
		this.course = course;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	
}
