package cn.edu.ustc.nsrl.b_list;

import java.util.ArrayList;
import java.util.List;

/*
 * List接口中特有的方法
 * 添加：
 * 	add(int index, Object o); //在指定位置上放入元素
 * 	addAll(int index, Collection c); //在指定位置上添加一个集合
 * 获取：
 * 	Object get(int index); //获取指定下标的元素
 * 	int indexOf(Object o); //获取某个元素的下标位置
 * 	int lastIndexOf(Object o); //找出指定元素最后一次出现在集合中的位置
 * 	List subList(int fromIndex, int toIndex); //获取子List集合
 * 修改：
 * 	set(int index, Object o); //设置指定下标上的元素
 * 迭代：
 * 	ListIterator();
 * 
 * */
public class Demo1 {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("鱼辣子");
		list.add("沙蟹汁");
		list.add("鲱鱼罐头");
		list.add("活蛆奶酪");
		
		System.out.println(list);		
		list.add(1, "变蛋");
		System.out.println(list);

		List list2 = new ArrayList();
		list2.add("麻辣小龙虾");
		list2.add("湖南红烧肉");
		list2.add("麻辣小龙虾");
		list.addAll(2, list2);
		System.out.println(list);
		
		System.out.println(list.get(5));
		System.out.println(list.indexOf("沙蟹汁"));
		System.out.println(list.indexOf("麻辣小龙虾"));
		System.out.println(list.lastIndexOf("麻辣小龙虾"));
//		在Java中所有用到区间范围的操作，都是要头不要尾
		List subList = list.subList(0, 5);
		System.out.println(subList);
		
		list.set(list.indexOf("鲱鱼罐头"), "长沙臭豆腐");
		System.out.println(list);
	}

}
