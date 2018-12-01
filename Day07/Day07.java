import java.util.Scanner;

class Day07 {
	public static void main(String[] args) {
		int[] arr1 = new int[10];
		int[] arr2 = new int[10];
		
		arr1[0] = 10;
		arr2[0] = 10;
		
		arr1 = arr2;
		
		arr2[0] = 20;
		
		System.out.println("arr1[0] = " + arr1[0]);
		System.out.println("arr2[0] = " + arr2[0]);
		
		System.out.println("请输入十个int类型的数据");
		getNumberFromStdin(arr1);
		printIntArray(arr1);
	}
	
	public static void getNumberFromStdin(int[] array) {
		if (null == array) {
			System.out.println("输入参数不合法");
			return;
		}
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		
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