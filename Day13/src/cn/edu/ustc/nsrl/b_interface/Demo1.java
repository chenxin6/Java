package cn.edu.ustc.nsrl.b_interface;

interface A {
	//成员变量
	int num = 10; // 缺省属性public static final
	//成员方法
	public void testA(); // 缺省属性是abstract
}

interface B {
	public void testB();
}

public class Demo1 implements A, B{

	@Override
	public void testA() {
		// TODO Auto-generated method stub
		System.out.println("实现接口中要求完成的testA方法");
	}
	@Override
	public void testB() {
		// TODO Auto-generated method stub
		System.out.println("实现接口中要求完成的testB方法");
	}
	
	public static void main(String[] args) {
		Demo1 d1 = new Demo1();
		
		d1.testA();
		d1.testB();
		System.out.println(Demo1.num);
	}

}
