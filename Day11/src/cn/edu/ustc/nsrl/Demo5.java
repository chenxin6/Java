package cn.edu.ustc.nsrl;

import java.util.Arrays;

class MyArraytools {
	
	public static boolean selectSort(int[] array) {
		if (null == array || array.length == 0) {
			System.out.println("输入参数不合法");
			return false;
		}
		
		for (int i = 0; i < array.length; i++) {
			int index = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[index] < array[j]) {
					index = j;
				}
			}
			if (index != i) {
				int temp = array[index];
				array[index] = array[i];
				array[i] = temp;
			}
		}
		
		return true;
	}

	public static String myToString(int[] array) {
		if (null == array || array.length == 0) {
			System.out.println("输入参数不合法");
			return null;
		}
		
		String ret = "[";
		
		for (int i = 0; i < array.length; i++) {
			if (i == array.length - 1) {
				ret += (array[i] + "]");
			} else {
				ret += (array[i] + ", ");				
			}
		}
		
		return ret; 
	}

	public static boolean myReverse(int[] array) {
		if (null == array || array.length == 0) {
			System.out.println("输入参数不合法");
			return false;
		}
		
		int temp = 0;
		for (int i = 0; i < array.length >>> 1; i++) {
			temp = array[i];
			array[i] = array[array.length - i - 1];
			array[array.length - i - 1] = temp;
		}
		return true;
	}
}

public class Demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1, 5, 3, 4, 2, 8, 9, 10, 7, 6};
		
		MyArraytools.selectSort(array);
		System.out.println(Arrays.toString(array));
		MyArraytools.myReverse(array);
		System.out.println(Arrays.toString(array));
		System.out.println(MyArraytools.myToString(array));
	}

}
