package cn.edu.ustc.nsrl.b_list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/*
 * List集合的三种遍历方式
 * for循环
 * 迭代器
 * 增强for循环
 * */

public class Demo3 {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("云姨");
		list.add("老付");
		list.add("大飞");
		list.add("我党");
		list.add("赋赋");
//		第一种方法
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("**************************");
//		第二种方法
		ListIterator it = list.listIterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("**************************");
//		第三种方法
		for (Object obj : list) {
			System.out.println(obj);
		}
	}

}
