class Day06_1 {
	public static void main(String[] args) {
		//int ret = maxOfNumber(10, 15);
		//double ret = minOfNumber(10.5, 20.5);
		//boolean ret = isMyUpper('a');
		//boolean ret = isMyNumber('5');
		boolean ret = isMyEnglish('a');
		System.out.println("ret = " + ret);
	}
	
	public static int maxOfNumber(int num1, int num2) {
		return num1 > num2 ? num1 : num2;
	}
	
	public static double minOfNumber(double num1, double num2) {
		return num1 > num2 ? num2 : num1;
	}
	
	public static boolean isMyUpper(char c) {
		boolean result = false;
		if (c >= 'A' && c <= 'Z') {
			result = true;
		}
		return result;
	}
	
	public static boolean isMyNumber(char c) {
		boolean result = false;
		if (c >= '0' && c <= '9') {
			result = true;
		}
		return result;
	}
	
	public static boolean isMyEnglish(char c) {
		boolean result = false;
		if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) {
			result = true;
		}
		return result;
	}
}