package com.qfedu.view;

import java.util.Scanner;

import com.qfedu.dao.TeamManager;
import com.qfedu.entity.Player;

public class View {
	public static void main(String[] args) {
//		Player p = new Player("韦德", 34, 100.0, "SG");
//		
//		System.out.println(p);
//		System.out.println(p.toString());
		TeamManager tm = new TeamManager("孤狼B组");
		Player P1 = new Player("森林狼", 21, 10000, "PG");
		Player P2 = new Player("西伯利亚狼", 19, 9000, "SF");
		Player P3 = new Player("鸵鸟", 20, 9500, "SG");
		Player P4 = new Player("卫生员", 22, 9800, "SG");
		Player P5 = new Player("恶狼", 22, 8800, "PF");
		Player P6 = new Player("老炮", 22, 9900, "C");
		
		tm.addPlayer(P1);
		tm.addPlayer(P2);
		tm.addPlayer(P3);
		tm.addPlayer(P4);
		tm.addPlayer(P5);
		tm.addPlayer(P6);	

		int flag = 0;
		int choose = 0;
		int playerId = 0;
		Scanner sc = new Scanner(System.in);
		
		while (true) {	
			System.out.println("欢迎来到孤狼B组");
			System.out.println("1. 展示所有成员");
			System.out.println("2. 添加新的成员");
			System.out.println("3. 退役老成员");
			System.out.println("4. 查询成员资料");
			System.out.println("5. 修改成员资料");
			System.out.println("6. 按照年龄排序");
			System.out.println("7. 按照收入排序");
			System.out.println("8. 退出");
			
			choose = sc.nextInt();
			sc.nextLine();
			
			switch (choose) {
				case 1:
					tm.showAllPlayers();
					break;
				case 2:
					System.out.println("请输入新成员名字");
					String name = sc.nextLine();
					
					System.out.println("请输入新成员年龄");
					int age = sc.nextInt();
					sc.nextLine();
					
					System.out.println("请输入新成员工资");
					double salary = sc.nextDouble();
					sc.nextLine();
					
					System.out.println("请输入新成员位置");
					String location = sc.nextLine();
					
					Player playerToAdd = new Player(name, age, salary, location);
					tm.addPlayer(playerToAdd);
					break;
				case 3:
					System.out.println("请输入要退役的成员Id");
					playerId = sc.nextInt();
					sc.nextLine();
					
					tm.showPlayerByPlayerId(playerId);
					
					System.out.println("是否要确定删除 Y or N");
					char ch = sc.nextLine().charAt(0);
					if ('Y' == ch || 'y' == ch) {
						tm.layoffPlayerByPlayerId(playerId);
					}
					break;
				case 4:
					System.out.println("请输入要查询的成员Id");
					playerId = sc.nextInt();
					sc.nextLine();
					
					tm.showPlayerByPlayerId(playerId);
					
					break;
				case 5:
					System.out.println("请输入要修改的成员Id");
					playerId = sc.nextInt();
					sc.nextLine();
					
					tm.modifyPlayerInfoByPlayerId(playerId);
					
					break;
				case 6:
					tm.ascendingSelectSortByAge();
					break;
				case 7:
					tm.descendingSelectSortBySalary();
					break;
				case 8:
					flag = 1;
					break;
				default:
					System.out.println("选择错误");
					break;
			} // switch-case
			if (1 == flag) {
				System.out.println("朋友再见");
				break;
			}
		} // while
		sc.close();
	} // main
}

/*
tm.showAllPlayers();
System.out.println("-----------------------------------");

tm.addPlayer(new Player("狗头老高", 40, 20000, "Coach"));
tm.showAllPlayers();
System.out.println("-----------------------------------");

tm.layoffPlayerByPlayerId(7);
tm.showAllPlayers();
System.out.println("-----------------------------------");

tm.descendingSelectSortBySalary();
System.out.println("-----------------------------------");
tm.ascendingSelectSortByAge();
System.out.println("-----------------------------------");

tm.showPlayerByPlayerId(4);
System.out.println("-----------------------------------");

tm.modifyPlayerInfoByPlayerId(1);
tm.showAllPlayers();
*/
