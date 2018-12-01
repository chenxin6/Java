import java.util.Scanner;

class Day05_1 {
	public static void main(String[] args) {
		
		char ch = '\0';
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		
		System.out.println("请输入一个字符");
		ch = sc.nextLine().charAt(0); // 固定写法，获取键盘上的第一个字符
		
		if (ch >= 'A' && ch <= 'Z') {
			System.out.println("这是一个大写字母");
		} else {
			System.out.println("这不是一个大写字母");
		}
	}
}