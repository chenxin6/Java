package cn.edu.ustc.nsrl;

class Dog {
	private String name;
	static String country = "JP";
	
	public Dog() {}
	
	public Dog(String name) {
		this.name = name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void run() {
		this.name = "亮亮";
		name = "lxl"; //非静态
		country = "Janp"; //静态
		System.out.println("跑来跑去");
	}
	
	public static void sleep() {
		
		country = "RB";
		System.out.println("睡大觉");
	}
	
	public static void test() {
		Dog dog = new Dog("狗子");
		
		System.out.println(dog.name);
	}
}

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog("Bobo");
		
		dog.run();
		
		Dog.sleep();
		Dog.test();
	}

}
