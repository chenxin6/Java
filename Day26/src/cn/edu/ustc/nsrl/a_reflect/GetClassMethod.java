package cn.edu.ustc.nsrl.a_reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/*
 * 通过反射借助于Class类对象，获取这个类里面所有的成员方法
 * Method就是成员方法类
 * */

public class GetClassMethod {

	public static void main(String[] args) throws ClassNotFoundException, 
	InstantiationException, IllegalAccessException, IllegalArgumentException, 
	InvocationTargetException, NoSuchMethodException, SecurityException {
		// 加载对应类的字节码文件，获取该类的Class类对象
		Class cls1 = Class.forName("cn.edu.ustc.nsrl.a_reflect.Person");
		// 获取所有public修饰的方法，这里也会获取一些额外的方法，例如notify和wait
		Method[] allPublicMethods = cls1.getMethods();
		for (Method method : allPublicMethods) {
			System.out.println(method);
		}
		// 暴力反射，能够获取Person里面的private方法，并且能够过滤掉从父类继承而来的方法
		System.out.println("***************");
		Method[] allMethods = cls1.getDeclaredMethods();
		for (Method method : allMethods) {
			System.out.println(method);
		}
		// 通过反射机制，执行类中的成员方法
		// 利用反射，创建一个当前类的对象
		System.out.println("***************");
		Person p = (Person) cls1.getConstructor(int.class, 
				String.class).newInstance(1, "chenxin");
		// 获取一个指定的方法，需要的参数是方法的名字字符串和参数列表
		Method aPublicMethod = cls1.getMethod("sleep", int.class);
		System.out.println(aPublicMethod);
		// 需要传进去的参数有：调用该方法的类对象作为第一个参数，后面的参数是这个方法的参数列表
		aPublicMethod.invoke(p, 15);
		
		// 获取一个静态方法
		System.out.println("***************");
		Method aPublicStaticMethod = cls1.getMethod("eat", null);
		aPublicStaticMethod.invoke(null, null);
	
		// 利用暴力反射获取一个私有化的成员方法
		System.out.println("***************");
		Method aPrivateMethod = cls1.getDeclaredMethod("testPrivateMethod", null);
		aPrivateMethod.setAccessible(true);
		aPrivateMethod.invoke(p, null);
	}

}
