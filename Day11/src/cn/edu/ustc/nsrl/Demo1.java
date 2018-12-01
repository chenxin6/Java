package cn.edu.ustc.nsrl;

class Person {
	private String name;
	static String country = "中国";
	
	public Person() {}
	public Person(String name) {
		this.name = name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
}

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("叶问");
		Person p2 = new Person("陈华顺");
		Person p3 = new Person("陈真");
		Person p4 = new Person("李云龙");
		
		System.out.println("p1.name:" + p1.getName());
		System.out.println("p2.name:" + p2.getName());
		System.out.println("p3.name:" + p3.getName());
		System.out.println("p4.name:" + p4.getName());
		
		System.out.println("p1.country:" + Person.country);
		System.out.println("p2.country:" + Person.country);
		System.out.println("p3.country:" + Person.country);
		System.out.println("p4.country:" + Person.country);
	}

}
