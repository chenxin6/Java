package cn.edu.ustc.nsrl.a_generticity;

/*
 * 在接口中定义泛型：
 * 	格式：
 * 	interface 接口名<自定义泛型的占位符> {
 * 		成员变量 缺省熟悉：public static final 定义时必须初始化
 * 		成员方法 缺省属性：abstract
 * 	}
 * 
 * 	两种遵从带有自定义泛型的接口方式：
 * 	一，更加自由，需要使用的泛型类型，在创建对象时确定，类似ArrayList
 * 	二，适合原本这个类就没有使用泛型的情况，例如：一个类遵从Comparable接口
 * 	实现compareTo方法，这里可以在遵从时，确定Comparable需要的泛型具体数
 * 	据类型，减少没有必要的强制类型转换
 * 
 * */

interface A<T> {
	public void testA(T t); //这个方法中使用了定义接口时声明的自定义泛型	
}
//一个类遵从接口，而且类中声明的自定义泛型和接口泛型一致，没有确定泛型的具
//体类型，由调用者来确定
class TestClass1<T> implements A<T> {
	@Override
	public void testA(T t) {
		System.out.println(t.getClass() + "类型！！！");
	}
}

//一个类遵从接口，但是接口的泛型已经被确定的数据类型替代
class TestClass2 implements A<String> {
	@Override
	public void testA(String t) {
		System.out.println("String类型的方法");
		
	}
}


public class Demo5 {

	public static void main(String[] args) {
		TestClass1<Integer> test = new TestClass1<Integer>();
		test.testA(5);
		
		TestClass2 test2 = new TestClass2();
		test2.testA("23333");
		
	}

}
