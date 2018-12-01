package cn.edu.ustc.nsrl;

class Fu {
	int age;
	String name;
	
	public Fu() {
		System.out.println("父类无参的构造方法");
	}
	public Fu(int age, String name) {
		if (age < 0) {
			this.age = 30;
		} else {
			this.age = age;
		}

		this.name = name;
		System.out.println("父类有参的构造方法");
	}
	
	public void work() {
		System.out.println("父亲是工程师");
	}
}

class Zi extends Fu {
	String hobby;
	
	public Zi() {
		System.out.println("子类无参构造方法");
	}
	public Zi(String hobby) {
		this.hobby = hobby;
		System.out.println("子类有参构造方法");
	}
	public Zi(String name, int age, String hobby) {
		//this.age = age;
		//this.name = name;
		super(age, name);
		this.hobby = hobby;
	}
	
	public void play() {
		//super.work();
		System.out.println("玩吃鸡");
	}
}

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Zi().play();
	}

}
