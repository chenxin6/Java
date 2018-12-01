package cn.edu.ustc.nsrl;

class Father {
	int age;
	String name;
	
	public Father() {}
	public Father(int age, String name) {
		if (age < 0) {
			this.age = 30;
		} else {
			this.age = age;
		}
		this.name = name;
	}
	
	public void playGame() {
		System.out.println(this.name + "喜欢钓鱼");
	}
}

class Son extends Father {
	int id;
	
	public Son() {}
	public Son(int age, String name, int id) {
		super(age, name);
		this.id = id;
	}
	
	@Override
	public void playGame() {
		System.out.println(this.name + "大吉大利，今晚吃鸡");
	}
}

public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Father f = new Father(60, "王健林");
		f.playGame();
		
		Son s = new Son(29, "王思聪", 666);
		s.playGame();
	}

}
