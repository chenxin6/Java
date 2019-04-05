package cn.edu.ustc.nsrl.a_innerclass;

/*
 * 内部类有三种：成员内部类，局部内部类，匿名内部类
 * 内部类和外部类的联系：
 * 	一，成员内部类可以使用外部类的成员变量和成员方法，不管用什么权限修饰，不管是private还
 * 	是public都可以使用，因为还是在内部类的内部使用
 * 	二，在外部类的外部创建外部类的内部类对象，格式如下：
 * 		外部类名.内部类名 内部类对象名 = new 外部类名().new 内部类名();
 * 	例如：
 * 		Outer.Inner inner = new Outer().new Inner();
 * 	格式如此复杂的原因是普通的成员变量和成员方法，在没有对象的情况下，不能在类外使用
 * 	三，如果内部类和外部类存在同名的成员变量，这里默认是就近原则，使用的是内部类的成员变量
 * 	如果想要使用外部类的成员变量，则要按照如下格式：
 * 		外部类名.this.同名成员变量;
 * 		外部类名.this.同名成员方法(参数列表);
 * 	四，在外部类的类内方法中，可以直接创建内部类的对象
 * 
 * */

class Outer {
	int num = 100; // 外部类的成员变量
	private static int s = 10;
	class Inner { // 这是Outer类的一个成员内部类
		int i = 10; // 内部类的成员变量
//		int num = 50;
		public Inner() {}
		public void testInner() {
			System.out.println("内部类的成员方法");
			testOuter(); // 内部类可以使用外部类的成员方法
			System.out.println(num); // 内部类可以使用外部类的成员变量，名字冲突时按照就近原则来
			System.out.println(Outer.this.num); // 强行访问外部类的成员变量
			test();
			Outer.this.test(); // 成员方法同成员变量
			System.out.println(s); // 即便是private修饰还是能访问到，内部类可见原则
			testStatic();
		}
		public void test() {
			System.out.println("内部类的test方法");
		}
	}
	public Outer() {};
	// 在外部类中定义内部类的类对象
	public void createInnerClass() {
		// 外部类的成员方法中调用内部类的构造方法，通过new关键字类创建内部类类对象使用
		Inner inner = new Inner();
		inner.testInner();
	}
	public void testOuter() {
		System.out.println("外部类的成员方法");
	}
	public void test() {
		System.out.println("外部类的test方法");
	}
	public static void testStatic() {
		System.out.println("外部类的静态成员方法");
	}
}

public class Demo1 {

	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.createInnerClass();
		System.out.println("*******************");
		// 这里是在外部类的外部创建一个Inner类对象，数据类型是Outer.Inner
		// 注意！没有对象就不能使用成员内部类
		Outer.Inner inner = new Outer().new Inner();
		inner.testInner();
	}

}
