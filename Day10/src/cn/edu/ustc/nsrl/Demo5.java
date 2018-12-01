package cn.edu.ustc.nsrl;

class Dog {
	private String name;
	private String color;
	private int age;

	public Dog() {
		this(10);
	}
	
	public Dog(String name) {
		this.name = name;
	}
	
	public Dog(int age) {
		this.age = age;
	}
	
	public Dog(String name, String color, int age) {
		this.name = name;
		this.color = color;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}

public class Demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
