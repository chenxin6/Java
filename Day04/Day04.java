//导包，让当前代码拥有使用Scanner工具的能力，他能从键盘获取数据！
import java.util.Scanner;

class Day04 {
	public static void main(String[] args) {
		int year = 0;
		int score = 0;
		int choose = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入年份:");
		year = sc.nextInt();
		System.out.println("请输入学生成绩:");
		score = sc.nextInt();
		
		if (score > 100 || score < 0) {
			System.out.println("输入参数不合法！！！");
			return;
		}
		
		if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
			System.out.println("This is leapYear");
		} else {
			System.out.println("This isn't leapYear");
		}
		
		if (score >= 90) {
			System.out.println("优!");
		} else if (score >= 80) {
			System.out.println("良!");
		} else if (score >= 70) {
			System.out.println("中!");
		} else if (score >= 60) {
			System.out.println("及格!");
		} else {
			System.out.println("不及格!");
		}
		
		System.out.println("请选择您要点的菜");
		System.out.println("1.红烧肉");
		System.out.println("2.酱肘子");
		System.out.println("3.鱼香肉丝");
		System.out.println("4.百威啤酒");
		
		choose = sc.nextInt();
		
		switch (choose) {
			case 1:
				System.out.println("红烧肉一份");
				break;
			case 2:
				System.out.println("酱肘子一份");
				break;
			case 3:
				System.out.println("鱼香肉丝一份");
				break;
			case 4:
				System.out.println("一打百威啤酒");
				break;
			default:
				System.out.println("没有您要的菜");
				break;
		}
	}
} 