package cn.edu.ustc.nsrl.a_generticity;

import java.util.ArrayList;
import java.util.Collection;

/*
 * 泛型的上下限，其中?是通配符
 * <? super T>
 * <? extends T>
 * 
 * 需求：定义一个函数接受任意类型数值的集合，但是这个数据必须是数值类型（限制了上限）
 * 		数值类型：Number 它的子类有：Integer Short Long Double Float
 * 		要求传入的对象是Number类对象或者是其子类对象(? extends Number)
 * 	
 * 需求：定义一个函数能够传入一个任意类型的集合，但是要求集合里面保存的数据必须
 * 		是Number类对象，或者其父类对象(? super Number)
 * 
 * 
 * */

public class Demo6 {

	public static void main(String[] args) {
		ArrayList<Number> list = new ArrayList<Number>();
		ArrayList<Double> list2 = new ArrayList<Double>();
		ArrayList<String> list3 = new ArrayList<String>();
		ArrayList<Object> list4 = new ArrayList<Object>();
		//传入的实际参数是一个ArrayList对象，里面保存的数据是Number类型
		test1(list);
		test1(list2);
//		这里是会报错的！！！
//		test1(list3);
		
		test2(list);
		test2(list4);
		
	}
	
	public static void test1(Collection<? extends Number> c) {
		System.out.println(c.toString());
	}
	
	public static void test2(Collection<? super Number> c) {
		System.out.println("泛型的下限！！！");
	}

}
