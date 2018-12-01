package cn.edu.ustc.nsrl;

class Person {
	private String name;
	private int id;
	
	{
		cry();
	}
	
	public Person() {}
	
	public Person(String n, int i) {
		name = n;
		id = i;
	}
	
	public Person(String n) {
		name = n;
	}
	
	public Person(int i) {
		id = i;
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public String getName() {
		return name;
	}
	
	public void setId(int i) {
		id = i;
	}
	
	public int getId() {
		return id;
	}
	
	public void cry() {
		System.out.println("哇哇大哭");
	}
	
	public void sleep() {
		System.out.println("哭完就睡");
	}
}

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person();
		p1.sleep();
		/*局部代码块
		{
			int i = 10;
		}
		*/
		
	}

}
