package cn.edu.ustc.nsrl.a_collection;

import java.util.ArrayList;
import java.util.Collection;

class Student {
	private int id;
	private String name;
	
	public Student() {}
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return "[ID:" + this.id + " Name:" + this.name + "]";
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
}


public class Demo1 {

	public static void main(String[] args) {
		Collection c = new ArrayList();
		Student stu1 = new Student(1, "chenglong");
		Student stu2 = new Student(2, "wujing");
		Student stu3 = new Student(3, "guoda");
		c.add(stu1);
		c.add(stu2);
		c.add(stu3);
		
		System.out.println(c);
//		contains方法调用了equals方法进行比较
		boolean ret = c.contains(new Student(1, "chenglong"));
//		这里是false，因为两个类对象在堆区中的地址不一样，除非我们重写equals和hashCode方法
//		系统默认的hashCode方法是当前类对象首地址的十进制数
//		系统默认的equals方法是两个类对象的比较法则
		System.out.println("ret:" + ret);
	}

}
