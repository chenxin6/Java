package cn.edu.ustc.nsrl.b_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<Object> c = new ArrayList<Object>();
		c.add("天气转凉，注意感冒");
		c.add("明天气温1~8度");
		c.add("测试");
		System.out.println(c);
		
		Collection<Object> c2 = new ArrayList<Object>();
		c2.add("测试1");
		c2.add("可可");
		c.addAll(c2);
		System.out.println(c);
		System.out.println(c2);
		
//		c2.clear();
//		System.out.println(c2);
		
		c.remove("测试");
		System.out.println(c);
		
//		c.removeAll(c2);
//		System.out.println(c);
		
		c.retainAll(c2);
		System.out.println(c);
		
		System.out.println(c.size());
		System.out.println(Arrays.toString(c.toArray()));
	}

}
