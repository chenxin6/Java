package cn.edu.ustc.nsrl.a_reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/*
 * 通过Class类对象获取当前类的构造方法，并使用该构造方法创建一个Person类对象
 * */

public class GetClassConstructor {
	public static void main(String[] args) throws ClassNotFoundException, 
	NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, 
	IllegalArgumentException, InvocationTargetException {
		// 加载指定类的字节码文件，获取对应的Class对象
		// 一，让JVM根据类名加载Person.java对应的字节码文件Person.class到内存的代码区
		// 二，把加载到内存代码区Person.class字节码文件生成一个Class类对象返回
		Class cls1 = Class.forName("cn.edu.ustc.nsrl.a_reflect.Person");
		// Constructor 这是构造方法的类，可以通过Class获取所有的非私有化构造方法
		// 具体的方法是Constructor[] getConstructors();
		Constructor[] constructors = cls1.getConstructors();
		for (Constructor constructor : constructors) {
			System.out.println(constructor);
		}
		System.out.println("*************");
		// 暴力反射，获取所有的构造方法包括私有化的构造方法
		Constructor[] allConstructors = cls1.getDeclaredConstructors();
		for (Constructor constructor : allConstructors) {
			System.out.println(constructor);
		}
		// 根据参数获取具体的构造方法，在确定数据类型的情况下，可以直接通过数据类型.class获取对应Class数据类型
		// 例如可以自动拆箱的这个 int.class
		System.out.println("*************");
		Constructor aConstructor = cls1.getConstructor(int.class, String.class);
		System.out.println(aConstructor);
		
		// 利用Constructor对象创建一个Person类对象
		Person p = (Person) aConstructor.newInstance(1, "chenxin");
		System.out.println(p.getId() + ":" + p.getName());
		p.sleep(5);
		p.game();
		// 如何通过反射机制调用static修饰的成员变量和成员方法并且不报警告，详见GetClassMethod
		p.eat(); 
		
		// 通过暴力反射，借助于指定的参数，获取private修饰的无参构造方法
		System.out.println("*************");
		Constructor privateConstructor = cls1.getDeclaredConstructor(null);
		System.out.println(privateConstructor);
		// 给予操作Private修饰方法的权限
		privateConstructor.setAccessible(true);
		Person p2 = (Person) privateConstructor.newInstance(null);
		p2.setId(2);
		p2.setName("chenxin");
		System.out.println(p2);
		
		// 单例和反射的共存问题：在实际开发中，如果一个类是单例类，那么一般不会有程序员通过
		// 反射的方式来使用这个类里面私有化的构造方法，这违背了单例的原则
	}
}
