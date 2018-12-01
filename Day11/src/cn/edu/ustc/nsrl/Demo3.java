package cn.edu.ustc.nsrl;

class Student {
	private int id; //自动赋值
	private String name;
	private String sex;
	private static int count = 1;
	
	{
		this.id = count++;
	}
	
	public Student() {}
	public Student(String name, String sex) {
		this.name = name;
		this.sex = sex;
	}
	
	public int getId() {
		return id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getSex() {
		return sex;
	}
	
}

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu1 = new Student();
		System.out.println(stu1.getId());
		
		Student stu2 = new Student();
		System.out.println(stu2.getId());
	}

}
