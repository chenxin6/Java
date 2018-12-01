package com.qfedu.entity;

public class Player {
	private String name;
	private int id;
	private int age;
	private double salary;
	private String location;
	
	private static int count = 1;
	
	{
		this.id = count++;
	}
	
	public Player () {}
	public Player (String name, int age, double salary, String location) {
		this.setName(name);
		this.setAge(age);
		this.setSalary(salary);
		this.setLocation(location);
	}
	
	public int getId() {
		return id;
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
		if (age <= 0 || age > 45) {
			this.age = 19;
		} else {
			this.age = age;			
		}
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		if (salary <= 0) {
			this.salary = 1;
		} else {
			this.salary = salary;			
		}
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public void shot() {
		System.out.println(this.getName() + "投篮练习中");
	}
	public void passBall() {
		System.out.println(this.getName() + "传球练习中");
	}
	
	//重写的Java中超类Object类中toString，toString是该对象的描述
	//当通过System.out.println(player)会自动调用的方法
	//原来的toString的功能是返回一个字符串，该字符串由类名，符号“@”
	//和此对象哈希吗的无符号十六进制表示组成
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[ID:" + this.id + " Name:" + this.name 
				+ " Age:" + this.age + " Salary:" + this.salary 
				+ " Location:" + this.location + "]";
	}
}
