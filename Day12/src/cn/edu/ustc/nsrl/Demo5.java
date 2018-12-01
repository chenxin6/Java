package cn.edu.ustc.nsrl;

class LOLHero {
	String name;
	
	public LOLHero() {}
	public LOLHero(String name) {
		this.name = name;
	}
	
	public void Q() {
		System.out.println("Q技能");
	}
	public void W() {
		System.out.println("W技能");
	}
	public void E() {
		System.out.println("E技能");
	}

}

class Caitlyn extends LOLHero{
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

class Verus extends LOLHero{
	@Override
	public void Q() {
		// TODO Auto-generated method stub
		System.out.println("穿刺之箭");
	}
	@Override
	public void W() {
		// TODO Auto-generated method stub
		System.out.println("腐败箭袋");
	}
	@Override
	public void E() {
		// TODO Auto-generated method stub
		System.out.println("恶灵箭雨");
	}
}

public class Demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Verus cx = new Verus();
		cx.Q();
		cx.W();
		cx.E();
		
		Caitlyn yuye = new Caitlyn();
		yuye.Q();
		yuye.W();
		yuye.E();
	}

}
