package dao;

//pojo class

public class Employee 
{
	private int id;
	private String name;
	private String password;
	private String country;
	private String email;
	
	public Employee(int id, String name, String password, String country, String email) {
		
		this.id = id;
		this.name = name;
		this.password = password;
		this.country = country;	
		this.email = email;
	}

	public Employee() {
		
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	
}
