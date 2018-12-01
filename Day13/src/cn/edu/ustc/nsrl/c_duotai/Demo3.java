package cn.edu.ustc.nsrl.c_duotai;

class Father {
	String name;
	int weigth = 90;
	
	public Father() {}
	public Father(String name) {
		this.name = name;
	}
	
	public void game() {
		System.out.println("曼切斯特");
	}
	public static void work() {
		System.out.println("机械工程师");
	}
}

class Son extends Father {
	int age = 16;
	int weight = 74;
	
	public Son(String name) {
		super(name);
	}
	
	@Override
	public void game() {
		// TODO Auto-generated method stub
		System.out.println("Housten Rocket");
	}
	public static void work() {
		System.out.println("程序员");
	}
}

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Son s = new Son("David");
		s.game();
		Son.work();
		
		Father f = new Father("Jack");
		f.game();
		Father.work();
		
		Father ftos = new Son("23333");//这就是多态
		ftos.game(); //出现了子类的Housten Rocket
		System.out.println(ftos.weigth); //出现类父类的90
		//ftos.work(); //出现了父类的机械工程师，但是一般不用这个方法因为会有警告
		//System.out.println(ftos.age); //不让使用子类特有的成员变量
	}

}
