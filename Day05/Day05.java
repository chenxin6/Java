import java.util.Scanner;

class Day05 {
	public static void main(String[] args) {
		
		int choose = 0;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("一");
			System.out.println("二");
			System.out.println("三");
			System.out.println("四");
			System.out.println("五");
			
			choose = sc.nextInt();
			
			switch (choose) {
				case 1:
					System.out.println("一");
					break;
				case 2:
					System.out.println("二");
					break;
				case 3:
					System.out.println("三");
					break;
				case 4:
					System.out.println("四");
					break;
				case 5:
					System.out.println("五");
					break;
				default:
					System.out.println("没有");
					break;
			} // switch (choose)
		} while (choose != 5);
	}
}