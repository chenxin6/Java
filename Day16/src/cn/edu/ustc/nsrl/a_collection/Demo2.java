package cn.edu.ustc.nsrl.a_collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

//迭代器的作用是循环遍历整个集合

public class Demo2 {

	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add("开封银基水世界");
		c.add("方特水世界");
		c.add("奥帕拉拉水世界");
		c.add("方特欢乐世界");
		
//		第一种遍历方式：将集合转换成数组进行遍历
		Object[] array = c.toArray();
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
//		第二种遍历方式：使用Iterator迭代器
//		boolean hasNext(); 判断当前迭代器是否有下一个元素，即next能不能调用成功
//		Object next(); 获取当前迭代器指向的元素的下一个元素，并且获取之后，指向这个元素
//		void remove(); 删除当前迭代器指向的元素，所以在调用remove方法之前必须要调用过next方法！所以不能连着调用remove方法
		Iterator it = c.iterator(); //返回当前集合的一个迭代器
//		System.out.println("当前元素中有没有下一个元素" + it.hasNext());
//		System.out.println("当前迭代器指向的元素" + it.next());
//		System.out.println("当前迭代器指向的元素" + it.next());
//		System.out.println("调用了一下下删除的方法");
//		it.remove();
////		it.remove(); //会报错的
		while (it.hasNext()) {
			System.out.println("迭代器操作" + it.next());
			it.remove();
		}
		System.out.println(c);
	}

}
