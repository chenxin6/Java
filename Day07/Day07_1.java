class Day07_1 {
	public static void main(String[] args) {
		int[] arr = {1, 3, 2, 4, 5, 6, 7, 8, 9, 0};
		int[] indexes = new int[arr.length];
		System.out.println(arr.length);
		/*int ret = findIndex(arr, 2);
		if (ret != -1) {
			System.out.println("ret = " + ret);
		} else {
			System.out.println("Not Found");
		}
		*/
		/*
		int ret = findMaxIndex(arr);
		if (ret != -1) {
			System.out.println("Max is " + arr[ret] + " at " + ret);
		}
		*/
		/*
		int count = findAllMaxIndex(arr, indexes);
		
		for (int i = 0; i < count; i++) {
			System.out.println("arr[" + indexes[i] + "] = " + arr[indexes[i]]);
		}
		*/
		
	}
	
	public static int findIndex(int[] array, int number) {
		if (null == array || array.length == 0) {
			System.out.println("输入的参数不合法");
			return -1;
		}
		
		int index = -1;
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] == number) {
				index = i;
				break;
			}
		}
		
		return index;
	}
	
	public static int findMaxIndex(int[] array) {
		if (null == array || array.length == 0) {
			System.out.println("输入的参数的不合法");
			return -1;
		}
		
		int index = 0;
		
		for (int i = 1; i < array.length; i++) {
			if (array[index] < array [i]) {
				index = i;
			}
		}
		
		return index;
	}
	
	public static int findAllMaxIndex(int[] array, int[] indexes) {
		if (null == array || array.length == 0 || null == indexes || 
		indexes.length == 0) {
			System.out.println("输入的参数不合法");
			return -1;
		}
		
		int max = array[0];
		for (int i = 1; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
		}
		
		int count = 0;
		for (int j = 0; j < array.length; j++) {
			if (max == array[j]) {
				indexes[count] = j;
				count++;
			}
		}
		return count;
	}

	
}