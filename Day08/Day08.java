class Day08 {
	public static void main(String[] args) {
		int[] arr = {1, 3, 5, 7, 9, 11, 13, 15, 0};
		//deleteItemInArray(arr, 6);
		arr = addItemToArray(arr, 5);
		printIntArray(arr);
	}
	
	public static int[] grow(int[] array) {
		if (null == array || array.length == 0) {
			System.out.println("输入参数不合法");
			return null;
		}
		int oldCapacity = array.length;
		int newCapacity = oldCapacity + oldCapacity / 2;
		int[] newArray = new int[newCapacity];
		for (int i = 0; i < oldCapacity; i++) {
			newArray[i] = array[i];
		}
		return newArray;
	}
	
	public static boolean deleteItemInArray(int[] array, int item) {
		if (null == array || array.length == 0 || 0 == item) {
			System.out.println("输入参数不合法");
			return false;
		}
		
		int index = -1;
		for (int i = 0; i < array.length; i++) {
			if (item == array[i]) {
				index = i;
				break;
			}
		}
		
		if (index != -1) {
			for (int j = index; j < array.length - 1; j++) {
				array[j] = array[j + 1];
			}
			array[array.length - 1] = 0;
			return true;
		} else {
			return false;
		}
	}
	
	public static int[] addItemToArray(int[] array, int item) {
		if (null == array || array.length == 0 || 0 == item) {
			System.out.println("输入参数不合法");
			return null;
		}
		
		if (array[array.length - 1] != 0) {
			array = grow(array);
		}
		
		int index = array.length - 1;
		for (int i = 0; i < array.length; i++) {
			if (item < array[i]) {
				index = i;
				break;
			}
		}
		
		for (int j = array.length - 1; j > index; j--) {
			array[j] = array[j - 1];
		}
		array[index] = item;
		return array;
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