package cn.edu.ustc.nsrl.b_collection;

import java.util.ArrayList;
import java.util.Collection;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<Object> c = new ArrayList<Object>();
		c.add("AKM");
		c.add("AUG");
		c.add("M4A1");
		c.add("M16");
		c.add("QZW95");
		
		Collection<Object> c2 = new ArrayList<Object>();
		c2.add("AKM");
		c2.add("AUG");
		c2.add("M4A1");
		c2.add("QZW95");
		c2.add("M16");
		
		System.out.println(c.equals(c2)); //顺序不同也会返回false
		
		//c2.clear();
		//c2.add("p92");
		//System.out.println(c2.isEmpty());
		
		System.out.println(c.contains("p92"));
		System.out.println(c.contains("AUG"));
		
		System.out.println(c.containsAll(c2));
	}

}
