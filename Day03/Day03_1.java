class Day03_1 {
	public static void main(String[] args) {
		int number1 = 20;
		int number2 = 10;
		int num1 = 15;
		int num2 = 5;
		int num = 10;
		boolean ret = (5 < 3) && (4 > 3);
		
		System.out.println("number1-number2 = " + (number1 - number2));
		System.out.println("number1 = " + number1);
		System.out.println("number2 = " + number2);
		
		number1 = number1 + number2; // 30 10
		number1 = number1 / number2; // 3 10
		number1 = number1 * number2; // 30 10
		number1 = number2 % number1; // 10 10
		
		number1 = (number2 + number1) * number2; // 200 10
		
		System.out.println("number1 = " + number1);
		System.out.println("number2 = " + number2);
		
		num1 = num1 + num2; // 20 5
		num1 += num2; // 25 5
		num1 -= num2; // 20 5
		num1 *= num2; // 100 5
		num1 %= num2; // 0 5
		num1 *= num2; // 0 5
		
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
		
		//System.out.println("num = " + num++); // 10
		//System.out.println("num = " + num); // 11
		System.out.println("num = " + ++num); // 11
		System.out.println("num = " + num); // 11
		
		System.out.println("5 > 3 : " + (5 > 3));
		System.out.println("ret = " + ret);
		
		ret =(5 < 3) || (4 > 3);
		System.out.println("ret = " + ret);
		
	}
}