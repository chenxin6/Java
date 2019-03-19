package cn.edu.ustc.nsrl.a_single;

/*
 *	需求：在整个程序的运行过程中，有且只能有一个当前类的类对象存在
 *	方案一：在整个程序的运行过程中，有且只调用一个构造方法
 *	问题：你知道只能调用一次，但是别人不知道，除了你自己别人都不会这么认为
 *		 任何一个调用者都可以非常简单的通过new关键字借助于当前类的构造方法创建一个新的对象，违背当前情况
 *	解决：让类外无法轻松的调用构造方法，私有化构造方法，但是私有化之后的构造方法在类外无法使用
 *	目前的情况是：构造方法不能用，类外没有对象，所有和对象有关的方法都不能使用，即现在能够使用的方法只能是静态（static）的方法
 *	所以我们要自己写一个类似于构造方法的方法，该方法要求如下：
 *		借助于静态（static）获取或者创建类对象
 *		该方法要提供给类外使用：权限修饰符为public
 *		调用时不能通过对象来调用，需要类名对象，即使用static修饰
 *		该方法是要获取当前类的类对象，所以返回值应该是当前类对象类型SingleDemo
 *		我可以将整个方法命名为getInstance()
 *		参数要和类内私有化的构造方法所需参数一致，例如SingleDemo需要int num
 *	
 *	这里我们还需要一个变量类保存创建对象的地址，该变量的数据类型SingleDemo，且该变量要是静态成员变量
 *	问题：发现类外可以直接通过类名来修改静态成员变量的数据，所以我们要用private来修饰
 *	以上就是单例思想
 *	创建流程：
 *	一：私有化构造方法
 *	二：提供给类外一个获取类对象的方法，一个static修饰的静态方法
 *	三：在类内定义一个static修饰的类对象类型的引用，用于保存创建对象的地址
 *	四：在getInstance()方法中判断之前是否存在对象，如果不存在，创建新的对象，如果存在，返回保存的地址
 *	五：私有化保存地址的静态成员变量，防止类外使用，并且一般情况下不会提供set和get方法
 * */

class SingleDemo {
	int num;
	private static SingleDemo s = null;
	private SingleDemo(int num) {
		this.num = num;
	}
	public static SingleDemo getInstance(int num) {
		if (s == null) {
			s = new SingleDemo(num);
			//私有化的构造方法可以在类内使用
		}
		return s;
	}
	public void test() {
		System.out.println(this.getClass() + "的test方法");
	}
}

public class Demo1 {
	public static void main(String[] args) {
		SingleDemo s1 = SingleDemo.getInstance(5);
		SingleDemo s2 = SingleDemo.getInstance(5);
		s1.test();
		s2.test();
		System.out.println(s1);
		System.out.println(s2);
	}
}
