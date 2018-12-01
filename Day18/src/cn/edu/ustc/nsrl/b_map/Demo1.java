package cn.edu.ustc.nsrl.b_map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * ---| Map<K, V> 双列集合
 * ------| HashMap 实现类
 * ------| TreeMap (HashSet利用了HashMap的Key不可重复原理)
 * 
 * 在Map<K, V>双列集合中，保存的只能是一个键值对
 * Map中要学习的方法：
 * 	增
 * 		put(K key, V value); 添加一个键值对
 * 		putAll(Map<? extends K, ? extends V> map); 添加一个符合数据类型的Map双列集合
 * 	删
 * 		clear(); 清空所有的键值对
 * 		remove(Object key); 根据Key删除对应的键值对
 * 	改
 * 		put(K key, V value); 当键存在时，这个操作是重新修改值
 * 	查
 * 		size(); 获取键值对的个数
 * 		get(Object key); 通过键找出对应的值
 * 		containsKey(Object key); 查看这个key是否在Map中存在
 * 		containsValue(Object value); 查看这个value是否在Map中存在
 * 		keySet(); 返回所有键的Set集合
 * 		values(); 返回所有值的Collection集合
 * 		
 * */

public class Demo1 {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("xuezhiqian", "gaoleixin");
		map.put("luhan", "guanxiaotong");
		map.put("songzhongji", "songhuiqiao");
		map.put("yuwenle", "wangtangyun");
		map.put("wangbaoqiang", "marong");
		
		System.out.println(map);
		
		Map<String, String> map2 = new HashMap<String, String>();
		map2.put("kebi", "wanisha");
		map2.put("TT", "kadaishan");
		
//		添加另一个Map
		map.putAll(map2);
		System.out.println(map);
		
		map2.clear();
		System.out.println(map2.isEmpty());
		
		map.remove("TT");
		System.out.println(map);

//		当Key存在时，这个操作修改对应的Value
		map.put("wangbaoqiang", null);
		System.out.println(map);

		System.out.println(map.size());
		System.out.println(map.containsKey("xietingfeng"));
		System.out.println(map.containsKey("xuezhiqian"));
		System.out.println(map.containsValue("gaoleixin"));
		System.out.println(map.containsValue("wangfei"));
		
		System.out.println(map.get("kebi"));
//		键值对不存在的话返回null
		System.out.println(map.get("TT"));
		
		Set<String> set = map.keySet();
		for (String string : set) {
			System.out.println(string);
		}
		System.out.println("***********************");
		Collection<String> c = map.values();
		for (String string : c) {
			System.out.println(string);
		}
		
		
	}

}
