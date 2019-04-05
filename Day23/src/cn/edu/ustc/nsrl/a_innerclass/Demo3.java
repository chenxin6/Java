package cn.edu.ustc.nsrl.a_innerclass;

import java.util.Arrays;
import java.util.Comparator;

abstract class Animal {
	int age;
	public abstract void jump();
	public abstract void test();
}
class CodingMonkey extends Animal {
	@Override
	public void jump() {
		System.out.println("jump");
	}
	@Override
	public void test() {
		System.out.println("test");
	}
}
interface A {
	int i = 0; // 默认修饰符是public static final
	public void testA(); // 默认修饰符是abstract
}

public class Demo3 {

	public static void main(String[] args) {
		CodingMonkey cm = new CodingMonkey();
		cm.test();
		cm.jump();
//		这个不会报错，这就是多态！！！
//		虽然抽象类没有自己的对象，但是可以借助于子类对象
		Animal a = cm;
		a.test();
		a.jump();
		Animal b = new Animal() {
//			这里面的内容和继承该抽象类的子类内容一致，都是抽象类要求子类实现的方法，这是类的本体
//			这个类没有名字所以这个就是匿名内部类
//			这里隐含了一个继承关系
			@Override
			public void test() {
				System.out.println("匿名内部类的test方法");
			}
			@Override
			public void jump() {
				System.out.println("匿名内部类的jump方法");
				
			}
		};
		b.jump();
		b.test();
//		匿名内部类的匿名对象直接调用方法
		new A() {
//			这里是一个类遵从接口之后，要求实现接口中的抽象方法，这里也是一个匿名内部类
			@Override
			public void testA() {
				System.out.println("匿名内部类实现interface A中的testA方法");
			}
		}.testA();
//		匿名内部类的匿名对象作为方法的参数
		Integer[] arr = {3, 2, 4, 5, 6, 1};
		Arrays.sort(arr, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1 - o2;
			}
		});
		System.out.println(Arrays.toString(arr));
	}

}
