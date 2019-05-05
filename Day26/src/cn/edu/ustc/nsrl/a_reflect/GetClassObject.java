package cn.edu.ustc.nsrl.a_reflect;

/*
 * 反射：当一个Java文件编译成一个.class文件，也就是字节码文件，
 * 当这个字节码文件加载到内存的方法区或代码区，JVM会根据加载的字节码文件内容创建一个Class的类对象，
 * 这个Class的类对象里面包含了当前字节码文件里面的所有内容！！！
 * 只要我们获取到这个Class对象，就可以为所欲为！！！
 * 这个Class对象中包含了对应字节码文件的所有成员变量和所有成员方法以及所有的构造方法
 * 获取Class类对象
 * 方法一：使用Class.forName("完整的类名字符串");
 * 完整类名是包括 包名.类名
 * 方法二：类名.class
 * 方法三：通过对象获取到对应的Class类对象
 * 
 * Constructor，Method，Field都是Java反射这个包里面的类
 * Constructor是构造方法类
 * Method是成员方法类
 * Field是成员变量类
 * 
 * Constructor常用方法：
 * Constructor[] getConstructors(); 获取所有public修饰的构造方法
 * Constructor[] getDeclaredConstructors(); 获取所有的构造方法包括私有化的构造方法
 * Constructor getConstructor(Class<?>... parameterTypes); 根据所需参数不同，获取指定的构造方法对象
 * Constructor getDeclaredConstructor(Class<?>... parameterTypes); 跟上面相同但可以获得私有化方法
 * Object newInstance(Object ... initargs); 给予确定的参数，通过反射调用构造方法，
 * 											这里的参数列表是一个不定参数列表
 * 
 * Method常用方法：
 * Method[] getMethods(); 获取当前类里面所有的public修饰的成员方法，这里会显示父类继承而来的public方法
 * 							注意！父类的private方法虽然能继承但没有使用权，所以这里不能获得这些方法
 * Method[] getDeclaredMethods(); 获取当前类里面的所有方法，包括private修饰的方法，
 * 									但是会过滤父类继承而来的方法
 * Method getMethod(String name, Class<?>... parameterTypes); 根据方法的名字和对应的
 * 																参数列表获取指定方法
 * Method getDeclaredMethod(String name, Class<?>... parameterTypes); 根据方法的名字和对应的
 * 												参数列表获取指定方法，可以获取private修饰的方法
 * invoke(Object obj, Object... args); 执行成员方法的函数，第一个参数是执行该方法的类对象，
 * 										第二个参数是执行该方法需要的参数列表
 * 
 * Field常用方法：
 * Field[] getFields(); 获取所有的用public修饰的成员变量，这里会显示父类继承而来的public修饰的成员变量
 * 						注意！父类的private成员变量虽然能继承但没有使用权，所以这里不能获得这些成员变量
 * Field[] getDeclaredFields(); 获取所有成员变量，包括用private修饰的成员变量
 * Field getField(String name); 根据成员变量的名字获取对应的成员变量
 * Field getDeclaredField(String name); 根据成员变量的名字获取包括private修饰在内的成员变量
 * set(Object obj, Object value); 设置成员变量的数值，第一个参数是调用该成员变量的对象，
 * 									第二个参数是赋予的数值
 * 
 * 暴力反射赋予权限的函数
 * setAccessible(boolean flag)
 * */

public class GetClassObject {

	public static void main(String[] args) throws ClassNotFoundException {
		Class cls1 = Class.forName("cn.edu.ustc.nsrl.a_reflect.Person");
		System.out.println(cls1);
		Class cls2 = Person.class;
		System.out.println(cls2);
		Class cls3 = new Person(1, "chenxin").getClass();
		System.out.println(cls3);
		// 三者返回同一个对象
		System.out.println(cls1 == cls2);
		System.out.println(cls2 == cls3);
		System.out.println(cls1 == cls3);
	}

}
