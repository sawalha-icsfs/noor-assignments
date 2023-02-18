package jdbc;

public class Student {
	 private int  id ;
	 private int averge;
	 private  String name;
	 private String email;
	public Student(int id,  String name ,int averge, String email) {
		super();
		this.id = id;
		this.averge = averge;
		this.name = name;
		this.email = email;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAverge() {
		return averge;
	}
	public void setAverge(int averge) {
		this.averge = averge;
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
	 
}
