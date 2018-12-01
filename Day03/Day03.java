class Day03 {
	public static void main(String[] args) {
		byte byteNumber = 10;
		short shortNumber = 20;
		int intNumber = 40; 
		long longNumber = 80L;
		
		System.out.println("byte:" + byteNumber);
		System.out.println("short:" + shortNumber);
		System.out.println("int:" + intNumber);
		System.out.println("long:" + longNumber);
		
		float floatNumber = 3.14F;
		double doubleNumber = 3.14;
		
		System.out.println("float:" + floatNumber);
		System.out.println("double:" + doubleNumber);
		
		boolean trueValue = true;
		boolean falseValue = false;
		
		System.out.println("trueValue:" + trueValue);
		System.out.println("flaseValue:" + falseValue);
		
		char ch1 = 'a';
		char ch2 = '\101';
		char ch3 = 97;
		char ch4 = '\0';
		
		System.out.println("char:" + ch1);
		System.out.println("char:" + ch2);
		System.out.println("char:" + ch3);
		System.out.println("char:" + (int)ch3);
		System.out.println("char:" + ch4);
	}
}