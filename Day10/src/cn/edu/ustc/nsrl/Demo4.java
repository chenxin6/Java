package cn.edu.ustc.nsrl;

class Test {
	int num = 1000;
	
	{
		num = 2000;
	}
	
	public Test() {
		num = 3000;
	}
}

public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t = new Test();
		System.out.println(t.num);
	}

}
