package cn.edu.ustc.nsrl.a_generticity;

import java.util.ArrayList;

/*
 * 使用泛型类解决之前遇到的问题：
 * 一，解决集合中数据类型一致化问题，要求保存什么数据，就保存什么数据，添加其他
 * 数据会报错，异常提前
 * 二，从集合中取出数据，保存的是什么类型，拿出来的就是什么类型，不存在无意义的
 * 强制类型转换
 * 
 * 标准格式：
 * 	ArrayList<String> list = new ArrayList<String>();
 * 以下情况也允许
 * 	ArrayList list = new ArrayList<String>();
 * 	ArrayList<String> list = new ArrayList();
 * 	这是为了照顾不同的版本问题和不同的IDE工具
 * 以下情况不允许
 * 	ArrayList<Object> list = new ArrayList<String>();
 * 	ArrayList<String> list = new ArrayList<Object>();
 * 	
 * 
 * */

public class Demo2 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("chenxin");
		list.add("zhuyianquan");
		list.add("123456");
		
//		这里无法保存除String类型之外的任意其他类型，所以这行代码会报错，错误提前了
//		list.add(new Demo2());
		String str = list.get(1);
		System.out.println(str);
		
		
	}

}
