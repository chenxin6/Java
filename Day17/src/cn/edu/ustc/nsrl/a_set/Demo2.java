package cn.edu.ustc.nsrl.a_set;

import java.util.HashSet;

/*
 * Set有两种实现方式
 * HashSet底层维护的是一个哈希表，存储效率很高
 * 发现：
 * 	每次添加元素的时候都会调用hashCode方法
 * 	重写equals方法和hashCode方法，也是首先调用hashCode方法，再来调用equals方法
 * HashSet存储原理：
 * 	向HashSet集合中添加元素，HashSet首先会调用该元素hashCode方法，获取该对象的Hash值
 * 	通过【位移】运算，计算出该元素应该保存在【哈希表】中哪一个位置
 * 	情况1:该位置没有任何元素，直接放入
 * 	情况2:该位置存在其他元素，哈希表就会调用该元素的equals方法，和已经保存在哈希表里面的元
 * 	素进行比较，如果比较结果为true，表示相同元素则无法添加
 * 	如果比较结果为false，表示为不同元素可以添加
 * 	哈希表的每一个单元格都是一个桶式结构，可以保存多个元素，允许元素共存！！！
 * 
 * TreeSet是一个属性结构的Set结构
 * 
 * */

class Student {
	int id;
	String name;
	
	public Student() {}
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Student的equals方法");
//		原本只是比较地址是否相同，现在重写为比较对象里面的数据是否一致
		Student stu = (Student) obj;
		System.out.println(this.name + "和" + stu.name + "进行比较");
		
		return this.id == stu.id && this.name.equals(stu.name);
	}
	
	@Override
	public int hashCode() {
		System.out.println("Student的hashCode方法");
//		重写了equals方法，同时也要重写hashCode方法
//		hashCodeֵ值要确定唯一性，只要满足你的逻辑要求即可
//		这里认为ID是唯一的
		return this.id;
//		return super.hashCode();
	}
	
	@Override
	public String toString() {
		return "[ID:" + this.id + " Name:" + this.name + "]";
	}
}

public class Demo2 {

	public static void main(String[] args) {
//		HashSet set = new HashSet();
//		set.add("kangye");
//		set.add("daxiong");
//		set.add("saojie");
//		set.add("linmeimei");
//		set.add("saolei");
//		set.add("baogege");
//		
//		System.out.println(set);
		
		HashSet set = new HashSet();
		set.add(new Student(1, "daxiong"));
		set.add(new Student(2, "baogege"));
		set.add(new Student(3, "saolei"));
		set.add(new Student(4, "saojie"));
		set.add(new Student(5, "linmeimei"));
		set.add(new Student(6, "kangye"));
//		因为是在堆区的新对象所以这里能够添加进去
		set.add(new Student(3, "saolei"));

		System.out.println(set);
		
	}

}
