package cn.edu.ustc.nsrl.b_list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/*
 * ListIterator()
 * 除了有
 * hasNext();
 * next();
 * remove();
 * 外还有
 * add(Object o); //更改next获取到的元素，原本next到的元素向后移，然后迭代器指向这个新加的元素
 * set(Object o); //替换当前迭代器指向的元素，然后迭代器指向这个新元素
 * nextIndex(); //下一个元素的下标
 * */

public class Demo2 {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("小米");
		list.add("Apple");
		list.add("华为");
		list.add("锤子");
		
		ListIterator it = list.listIterator();
		System.out.println("有下一个元素吗？" + it.hasNext());
		System.out.println("next获取数据" + it.next());
		System.out.println("set方法替换");
		it.set("mi");
		System.out.println(list);
		
		it.add("360");
		System.out.println(list);
		
		System.out.println("next获取数据" + it.next());
		System.out.println(it.nextIndex());
	}

}
