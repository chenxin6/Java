package cn.edu.ustc.nsrl;

class Hero {
	private int blood;
	private int power;
	
	public Hero () {
		System.out.println("父类Hero类的无参构造方法");
	}
	public Hero (int blood, int power) {
		this.blood = blood;
		this.power = power;
		System.out.println("父类Hero类的有参构造方法");
	}
	
	public int getBlood() {
		return blood;
	}
	public void setBlood(int blood) {
		this.blood = blood;
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	
	public void D() {
		System.out.println("闪现");
	}
	public void F() {
		System.out.println("点燃");
	}
//	private void test() {
//		System.out.println("父类中私有化的方法");
//	}
}

//extends 继承的关键字，表示当前VN类是Hero类的一个子类
class VN extends Hero {
	private String name;
	
	public VN() {
		System.out.println("子类VN类的无参构造方法");
	}
	public VN(String name) {
		this.name = name;
		System.out.println("子类VN类的有参构造方法");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void R() {
		System.out.println("终极时刻");
	}
}

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Hero h = new Hero();
		//System.out.println(h);
		
		VN vn = new VN();
		System.out.println(vn);
		
		vn.setBlood(100);
		vn.setPower(200);
		
		vn.setName("暗影猎手");
		
		vn.D();
		vn.F();
		
		vn.R();
		
		//vn.test();父类中私有化的子类没有使用权限
	}

}
