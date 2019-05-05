package cn.edu.ustc.nsrl.a_reflect;

public class Person {
	private int id;
	private String name;
	public int test;
	public static int testStatic = 10;
	private Person() {}
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
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
	public static void eat() {
		System.out.println("eat");
	}
	public void sleep(int num) {
		System.out.println(name + "睡" + num);
	}
	public void game() {
		System.out.println("game");
	}
	private void testPrivateMethod() {
		System.out.println("private");
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}
}
