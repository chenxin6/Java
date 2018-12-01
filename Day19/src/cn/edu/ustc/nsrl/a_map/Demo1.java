package cn.edu.ustc.nsrl.a_map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo1 {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("MacBook Pro", 22888);
		map.put("iPhoneX", 8398);
		map.put("iPad Pro", 5198);
		
		System.out.println(map);
		
//		第一种遍历方式：借助于KeySet
		Set<String> set = map.keySet();
//		使用Set集合的Iterator迭代器
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			String key = it.next();
			int value = map.get(key);
			System.out.println(key + "=" + value);
		}
//		以上方法是获取Key值，然后再借助于Map里面的get方法，获取对应的Value
//		并没有获取到完整的键值对
//		在Map集合中，保存的每一个键值对都是一个Entry对象，把这些Entry对象
//		获取出来，做成一个集合，进行遍历
		System.out.println("***********");
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> it2 = entrySet.iterator(); 
		while (it2.hasNext()) {
			System.out.println(it2.next());
		}
		
		
	}

}
