class Person {
	private String name;
	private int age;
	private String gender;
	
	public void setName(String n) {
		name = n;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int a) {
		if (a < 0 || a > 130) {
			age = 16;
		} else {
			age = a;
		}
	}
	
	public int getAge() {
		return age;
	}
	
	public void setGender(String g) {
		if ("男" == g || "女" == g) {
			gender = g;
		} else {
			gender = "男";
		}
	}
	
	public String getGender() {
		return gender;
	}
	
	public void winner() {
		System.out.println("Winner winner chicken dinner");
	}
	
	private void test() {
		System.out.println("调试我一下试试");
	}
}

public class Day09_2 {
	public static void main(String[] args) {
		Person lxl = new Person();
		
		//lxl.name = "逗逼";
		//lxl.age = 16;
		//lxl.gender = "男";
		lxl.setName("逗逼");
		lxl.setAge(-16);
		lxl.setGender("狗");
		
		System.out.println("Name:" + lxl.getName() + " Age:" + lxl.getAge() 
		+ " Gender:" + lxl.getGender());
		
		lxl.winner();
	}
}