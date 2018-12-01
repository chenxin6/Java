package cn.edu.ustc.nsrl.c_arraylist;

import java.util.ArrayList;

/*
 * ArrayList是底层维护了一个Object类型的数组
 * 当调用无参构造方法ArrayList，这里创建的底层Object类型的数组元素个数默认为10
 * ArrayList特有的方法：
 * 	ensureCapacity(int minCapacity); //判断当前ArrayList底层Object数组的元素个数是否大于minCapacity，如果小于等于则扩容
 * 	trimToSize(); //截断底层维护的Object类型的数组，让数组容量变成当前ArrayList的size值ֵ
 * 
 * */

public class Demo1 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
	}

}
