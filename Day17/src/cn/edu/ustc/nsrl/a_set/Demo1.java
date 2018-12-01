package cn.edu.ustc.nsrl.a_set;

import java.util.HashSet;
import java.util.Set;

/*
 * Set 接口 无序 不可重复
 * */

public class Demo1 {

	public static void main(String[] args) {
		Set set = new HashSet();
		set.add("2");
		set.add("1");
		set.add("4");
		set.add("3");
		set.add("5");
		
		System.out.println(set);
	}

}
