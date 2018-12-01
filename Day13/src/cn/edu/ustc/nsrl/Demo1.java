package cn.edu.ustc.nsrl;

abstract class Hero {
	int blood;
	int power;
	
	public Hero() {}
	public Hero(int blood, int power) {
		this.blood = blood;
		this.power = power;
	}
	
	abstract public void Q();
	abstract public void W();
	abstract public void E();	
}

class Fizz extends Hero {
	
	public Fizz() {}
	public Fizz(int blood, int power) {
		super(blood, power);
	}
	
	@Override
	public void Q() {
		// TODO Auto-generated method stub
		System.out.println("淘气打击");
	}
	@Override
	public void W() {
		// TODO Auto-generated method stub
		System.out.println("海石三叉戟");
	}
	@Override
	public void E() {
		// TODO Auto-generated method stub
		System.out.println("古灵精怪");
	}
}

class Caitlyn extends Hero{
	
	public Caitlyn() {}
	public Caitlyn(int blood, int power) {
		super(blood, power);
	}
	
	@Override
	public void Q() {
		// TODO Auto-generated method stub
		System.out.println("和平使者");
	}
	@Override
	public void W() {
		// TODO Auto-generated method stub
		System.out.println("约德尔诱捕器");
	}
	@Override
	public void E() {
		// TODO Auto-generated method stub
		System.out.println("90口径绳网");
	}
}

abstract class Test {
	public void test() {
		System.out.println("测试");
	}
}

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fizz fizz = new Fizz(100, 100);
		fizz.Q();
		fizz.W();
		fizz.E();
		
		Caitlyn caitlyn = new Caitlyn(100, 100);
		caitlyn.Q();
		caitlyn.W();
		caitlyn.E();
	}

}
