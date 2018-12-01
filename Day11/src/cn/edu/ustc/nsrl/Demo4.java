package cn.edu.ustc.nsrl;

import java.util.Arrays;

public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1, 5, 3, 4, 2, 8, 9, 10, 7, 6};
		
		Arrays.sort(array);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		String arrString = Arrays.toString(array);
		System.out.println(arrString);
		
		int index = Arrays.binarySearch(array, 5);
		System.out.println("index = " + index);
		
	}

}
