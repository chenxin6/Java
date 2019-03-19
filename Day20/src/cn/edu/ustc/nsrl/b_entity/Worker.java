package cn.edu.ustc.nsrl.b_entity;

public class Worker {
	private int id;
	private String name;
	private String password;
	private char gender;
	private float salary;
	private static int workCount = 1;
	{
		id = workCount++;	
	}
	public Worker() {
		super();
	}
	public Worker(String name, String password, char gender, float salary) {
		super();
		this.name = name;
		this.password = password;
		this.gender = gender;
		this.salary = salary;
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
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public static int getWorkCount() {
		return workCount;
	}
	public static void setWorkCount(int workCount) {
		Worker.workCount = workCount;
	}
	public int getId() {
		return id;
	}
	
	@Override
	public String toString() {
		return "Worker [id=" + id + ", name=" + name + ", gender=" + gender + ", salary=" + salary + "]";
	}
	@Override
	public int hashCode() {
		return this.id;
	}
	@Override
	public boolean equals(Object obj) {
		Worker w = (Worker) obj;
		return this.id == w.id;
	}
}
