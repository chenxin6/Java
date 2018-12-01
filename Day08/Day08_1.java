class Person {
	String name;
	int age;
	float weight;
	
	public void eat() {
		System.out.println("吃饭");
	}
	
	public void sleep() {
		System.out.println("睡觉");
	}
	
	public void play() {
		System.out.println("玩");
	}
}

public class Day08_1 {
	public static void main(String[] args) {
		/*
		创建类对象的方法
		Person 就是一个数据类型，具体来说，是一个类对象数据类型
		lxl 对象名，而且对象名都是一个引用数据类型
		new 创建对象的关键字，new关键字是申请内存堆区空间的关键字
		Person() 不知道
		*/
		Person lxl = new Person();
		lxl.name = "逗逼";
		lxl.age = 16;
		lxl.weight = 74;
		
		lxl.eat();
		lxl.sleep();
		lxl.play();
		
		System.out.println(lxl);
		/*
		Person@15db9742
		其中后面的数字是该对象在内存中的首地址
		*/
	}
}