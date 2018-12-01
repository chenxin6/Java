package cn.edu.ustc.nsrl.a_generticity;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * 遇到问题：
 * 	一，发现ArrayList可以放入任意类型的数据，这个操作很爽，但是实际操作中发现
 * 	数据类型不一致，会导致更多的错误，这个很不爽
 * 	二，就算是知道取出的数据是一个String类型，但是还是要通过强转才能真正拿到想
 * 	要的String类型数据，这个操作很麻烦！！！
 * 期望：
 * 	集合中的数据类型能够统一
 * 	数据类型一致化问题
 * 解决问题：
 * 	用泛型（jdk1.5֮之后的新特征）
 * 
 * */

public class Demo1 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new Demo1());
		list.add("jintian");
		list.add(25);
		
		System.out.println(list);
		
		Object obj = list.get(1);
		String str = (String) obj;
		System.out.println(str);
		
		Object[] arr = list.toArray();
		Arrays.sort(arr);
		System.out.println(arr.toString());
	
	}

}
