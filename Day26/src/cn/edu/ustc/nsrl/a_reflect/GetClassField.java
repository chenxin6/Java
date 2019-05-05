package cn.edu.ustc.nsrl.a_reflect;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/*
 * 通过反射获取Class类对象里面所有的成员变量
 * Field成员变量类
 * */

public class GetClassField {
	public static void main(String[] args) throws ClassNotFoundException, 
	NoSuchFieldException, InstantiationException, IllegalAccessException, 
	IllegalArgumentException, InvocationTargetException, NoSuchMethodException, 
	SecurityException {
		Class cls1 = Class.forName("cn.edu.ustc.nsrl.a_reflect.Person");
		// 获取所有用Public修饰的成员变量
		Field[] allPublicFields = cls1.getFields();
		for (Field field : allPublicFields) {
			System.out.println(field);
		}
		// 暴力反射
		System.out.println("***************");
		Field[] allFields = cls1.getDeclaredFields();
		for (Field field : allFields) {
			System.out.println(field);
		}

		System.out.println("***************");
		Field aPublicField = cls1.getField("test");
		System.out.println(aPublicField);
		
		System.out.println("***************");
		Field aPrivateField = cls1.getDeclaredField("id");
		System.out.println(aPrivateField);
		
		// set方法
		// set(Object obj, Object value);
		// 第一个参数：要操作的是哪一个对象里面的成员变量
		// 第二个参数：需要设置的值
		System.out.println("***************");
		Person p = (Person) cls1.getConstructor(int.class, String.class).newInstance(1, "chenxin");
		aPublicField.set(p, 20);
		System.out.println(p.test);
		
		System.out.println("***************");
		Field aStaticField = cls1.getField("testStatic");
		System.out.println(aStaticField);
		aStaticField.set(null, 30);
		System.out.println(Person.testStatic);
		
		System.out.println("***************");
		aPrivateField.setAccessible(true);
		aPrivateField.set(p, 10);
		System.out.println(p.getId());
	}
}
