package cn.edu.ustc.nsrl.a_generticity;

/*
 * 泛型的使用需要：
 * 	占位符！！！<一个大写字母>，只是一个占位符，没有实际含义，而且不同地方定义
 * 	的占位符没有联系
 * 泛型在函数中使用的格式：
 * 	修饰符 <声明的自定义泛型占位符> 返回值类型（可以使用自定泛型）函数名(形式参数列表“也可以使用泛型”) {
 * 		函数体
 * 		在函数体中，所有用到自定义泛型的地方，都可以被替换
 * }
 * 包装类：
 * 	Java是完全面向对象的语言，在Java中万物皆对象，如果要保存类对象，那么8大
 * 	基本数据类型就无法使用，所以，Java提供了一个包装机制，包装基本数据类型，
 * 	让他们变成对象
 * 	Integer -> int
 * 	Byte -> byte
 * 	Long -> long
 * 	Short -> short
 * 	Double -> double
 * 	Float -> float
 * 	Boolean -> boolean
 * 	Character -> char
 * 使用包装类直接赋值给普通的基本数据类型，这个操作称之为拆箱
 * 他们之间会自动装箱和自动拆箱
 * 
 * */

public class Demo3 {

	public static void main(String[] args) {
		String str = getType("String");
		Demo3 d = getType(new Demo3());
		
		int num = getType(5);
	}
	
//	<E>是占位符，表示在该函数中可以使用占位符E，而E的具体数据类型由传入参数
//	控制，这样操作可以让函数多样化，多元化
	public static <E> E getType(E e) {
		return e;
	}
}
