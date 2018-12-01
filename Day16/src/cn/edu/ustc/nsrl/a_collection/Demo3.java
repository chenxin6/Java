package cn.edu.ustc.nsrl.a_collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo3 {

	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add("方中山胡辣汤");
		c.add("天堂鸟");
		c.add("萧记烩面");
		c.add("班记油泼面");
		
		Iterator it = c.iterator();
		
//		java.util.ConcurrentModificationException
//		这里存在两种操作集合数据的方式，第一种方式：集合的对象c，第二种方式：集合的迭代器it
//		从而出现了共享资源的问题
//		避免这样问题的方法：用迭代器操作就别用集合对象或者用集合对象操作就别用迭代器
		
		
		while (it.hasNext()) {
			System.out.println(it.next());
//			c.remove("天堂鸟");
		}
	}

}
