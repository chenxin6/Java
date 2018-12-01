package cn.edu.ustc.nsrl.b_treeset;

import java.util.Comparator;
import java.util.TreeSet;

/*
 * TreeSet是一个树形结构的Set结构
 * 发现：
 * 	TreeSet中添加元素原本是字符串类型，当添加自定义对象，或者数字的时候，报异常！！！
 * 原因：
 * 	原因TreeSet是一个树形结构，所有的元素都需要进行比较之后才可以放入到Set集合中，而
 * 	字符串和自定义类对象是没有比较的方式和方法的，所以这就要求在TreeSet里面的所有的元
 * 	素都要有【比较的方式】或者有【自然顺序】
 * TreeSet添加自定义元素的方式
 * 	方式1：让这个定义类【遵从】Comparable接口，实现compareTo方法
 * 	方式2：自定义比较器，这个比较器是遵从Comparator接口并
 * 	实现int compare(Object o1, Object o2)，可以在创建TreeSet对象的时候传入
 * 	比较器对象作为比较方式
 *  
 * */

class Person implements Comparable {
	int id;
	int salary;
	String name;
	
	public Person() {}
	public Person(int id, int salary, String name) {
		this.id = id;
		this.salary = salary;
		this.name = name;
	}
	
	@Override
	public int compareTo(Object o) {
//		返回值有三种：0，正整数，负整数
//		0表示相同
//		正整数表示【调用这个方法的对象】大于传值的对象
//		负整数表示【调用这个方法的对象】小于传值的对象
		System.out.println("这里是类内的比较方式");
		Person p = (Person) o;
		return this.salary - p.salary;
	}
	
	@Override
	public String toString() {
		return "[ID:" + id + " Name:" + name + " Salary:" + salary + "]";
	}
}

class MyCompare implements Comparator {
	
	@Override
	public int compare(Object o1, Object o2) {
		System.out.println("自定义比较器");
		Person p1 = (Person) o1;
		Person p2 = (Person) o2;
		return p1.salary - p2.salary;
	}
	
}

public class Demo1 {

	public static void main(String[] args) {
//		TreeSet set = new TreeSet();
//		创建TreeSet的时候，传入自定义比较器对象
		TreeSet set = new TreeSet(new MyCompare());
//		set.add("1");
//		set.add("2");
//		set.add("3");
//		set.add("4");
//		set.add("5");
//		set.add("6");
//		set.add("7");
//		set.add("8");
//		set.add("9");
//		set.add("10");
		
		set.add(new Person(1, 20, "daxiong"));
		set.add(new Person(2, 21, "saolei"));
		set.add(new Person(3, 18, "saojie"));
		set.add(new Person(4, 15, "linmeimei"));
		set.add(new Person(5, 2, "kangye"));
		
		System.out.println(set);
	}

}
