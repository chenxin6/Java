package cn.edu.ustc.nsrl.a_innerclass;

/*
 * 局部内部类：放在方法内或者函数内的类，称之为局部内部类
 * 局部变量
 * 	生存期：从声明定义位置开始到代码块结束
 * 	作用域：只能在当前代码块内部
 * 类对象
 * 	生存期：通过new关键字创建的时候开始，JVM垃圾回收机制调用时，销毁该对象，结束
 * 	作用域：哪个引用变量拥有这个对象的首地址，哪里就是他的作用域
 * 
 * 发现：局部内部类中，貌似不能修改所在方法或者函数中的局部变量！！！
 * 说明：局部内部类的对象是在函数或者方法的内部通过JVM借助于new关键字和局部内部类的构造方法，创建
 * 的一个类对象，并且该对象是由JVM的垃圾回收机制回收的。但是局部变量n是在testInner()方法中，而这个
 * 局部变量n的生存周期是和testInner()该方法的大括号有关，生存期和作用域都是在大括号以内
 * 如果在testInner()方法的内部，MethodInner()这个类是方法中的局部内部类，而创建的对象在使用testInner()
 * 方法中的局部变量时，因为对象的销毁时间不确定，但是不一定是晚于局部变量的销毁的，这里隐含了一个类对象延长了
 * 局部变量生存期的问题，这个是不符合Java原理的
 * 这就是为什么不能修改的原因。为了解决这个问题可以用final修饰那个局部变量，即如果局部内部类要使用所在函数
 * 或者方法的局部变量，该变量用final修饰
 * 
 * */

class Test {
	int num = 100;
	public void testInner() {
		// 这里是在方法中定义了一个类，这个类只能在当前函数或者方法中使用
		int n = 1000;
		class MethodInner {
			int i = 10;
			public void function() {
				System.out.println(i);
				num = 200;
				System.out.println(num);
//				发现问题！！！
//				n = 2000;
				System.out.println(n);
				System.out.println("局部内部类的成员方法");
			}
		}
		MethodInner me = new MethodInner();
		me.function();
	}
}

public class Demo2 {

	public static void main(String[] args) {
//		for (int i = 0; i < 10; i++) {
//			System.out.println(i);
//		}
//		Test test = new Test();
		new Test().testInner();
	}

}
