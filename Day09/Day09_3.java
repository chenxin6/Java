public class Day09_3 {
	public static void main(String[] args) {
		int[] array = {1, 3, 5, 7, 9, 2, 4, 6, 8, 10};
		
		selectSort(array);
		//putMaxAtFirstIndex(array);
		//putSecondAtSecondIndex(array);
		//putThirdAtThirdIndex(array);
		printIntArray(array);
	}
	
	public static boolean selectSort(int[] array) {
		if (null == array || array.length == 0) {
			System.out.println("输入参数不合法");
			return false;
		}
		int index = 0;
		for (int i = 0; i < array.length - 1; i++) {
			index = i;
			
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
	
	public static boolean putMaxAtFirstIndex(int[] array) {
		if (null == array || array.length == 0) {
			System.out.println("输入参数不合法");
			return false;
		}
		
		int index = 0;
		for (int i = 1; i < array.length; i++) {
			if (array[index] < array[i]) {
				index = i;
			}
		}
		
		if (index != 0) {
			int temp = array[index];
			array[index] = array[0];
			array[0] = temp;
		}
		
		return true;
	}
	
	public static boolean putSecondAtSecondIndex(int[] array) {
		if (null == array || array.length == 0) {
			System.out.println("输入参数不合法");
			return false;
		}
		
		int index = 1;
		for (int i = 2; i < array.length; i++) {
			if (array[index] < array[i]) {
				index = i;
			}
		}
		
		if (index != 1) {
			int temp = array[index];
			array[index] = array[1];
			array[1] = temp;
		}
		return true;
	}
	
	public static boolean putThirdAtThirdIndex(int[] array) {
		if (null == array || array.length == 0) {
			System.out.println("输入参数不合法");
			return false;
		}
		
		int index = 2;
		for (int i = 3; i < array.length; i++) {
			if (array[index] < array[i]) {
				index = i;
			}
		}
		
		if (index != 2) {
			int temp = array[index];
			array[index] = array[2];
			array[2] = temp;
		}
		return true;
	}
	
	public static void printIntArray(int[] array) {
		if (null == array) {
			System.out.println("输入参数不合法");
			return;
		}
		
		for (int i = 0; i < array.length; i++) {
			System.out.println("array[" + i + "] = " + array[i]);
		}
	}
} 