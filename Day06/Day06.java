class Day06 {
	public static void main(String[] args) {
		int ret = returnFive();
		int sum = getSumOfTwoNumber(10, 5);
		
		System.out.println("ret = " + ret);
		System.out.println("sum = " + sum);
		
		printHello();
		printHello(5);
		
		addTwoNumber(10, 5);
	}
	/*
	修饰符(public static) 返回值类型 函数名(形式参数列表) {
		//函数体
	}
	*/
	public static void printHello() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("你好");
		}
	}
	
	public static void printHello(int a) {
		for (int i = 1; i <= a; i++) {
			System.out.println("你好");
		}
	}
	
	public static void addTwoNumber(int num1, int num2) {
		System.out.println("num1 + num2 = " + (num1 + num2));
	}
	
	public static int returnFive() {
		return 5;
	}
	
	public static int getSumOfTwoNumber(int num1, int num2) {
		return num1 + num2;
	}
}