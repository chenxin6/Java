package com.qfedu.dao;

import java.util.Scanner;

import com.qfedu.entity.Player;

public class TeamManager {
	private String teamName;
	private Player[] allPlayers = new Player[defaultCount];
	
	private static int itemsCount = 0;
	private static final int defaultCount = 10;
	
	public TeamManager() {}
	public TeamManager(String teamName) {
		this.setTeamName(teamName);
	}
	
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public void addPlayer(Player playerToAdd) {
		if (null == playerToAdd) {
			System.out.println("球员信息为空，不可添加");
			return;
		}
		if (itemsCount >= allPlayers.length) {
			grow();
		}
		allPlayers[itemsCount++] = playerToAdd;			
	}
	public void layoffPlayerByPlayerId(int playerId) {
		int index = findPlayerIndexByPlayerId(playerId);
		if (index >= 0) {
			for (int i = index; i < itemsCount - 1; i++) {
				allPlayers[i] = allPlayers[i + 1];				
			}
			allPlayers[itemsCount - 1] = null;
			itemsCount--;
		} else {
			System.out.println("查无此人，无法删除");
		}
	}
	public void showPlayerByPlayerId(int playerId) {
		int index = findPlayerIndexByPlayerId(playerId);
		if (index > -1) {
			System.out.println(allPlayers[index]);
		} else {
			System.out.println("查无此人");
		}
	}
	public void modifyPlayerInfoByPlayerId(int playerId) {
		int index = findPlayerIndexByPlayerId(playerId);
		Scanner sc = new Scanner(System.in);
		if (index > -1) {
			int flag = 0;
			int choose = -1;
			Player temp = allPlayers[index];
			
			while (true) {
				System.out.println("修改" + temp.getId() + ":" 
						+ temp.getName() + "的信息");
				System.out.println("***Age:" + temp.getAge());
				System.out.println("***Salary:" + temp.getSalary());
				System.out.println("***Location:" + temp.getLocation());
				
				System.out.println("1. 修改球员姓名");
				System.out.println("2. 修改球员年龄");
				System.out.println("3. 修改球员工资");
				System.out.println("4. 修改球员位置");
				System.out.println("5. 退出");
				
				choose = sc.nextInt();
				sc.nextLine();
				
				switch (choose) {
					case 1:
						System.out.println("请输入球员的姓名：");
						String name = sc.nextLine();
						temp.setName(name);
						break;
					case 2:
						System.out.println("请输入球员的年龄：");
						int age = sc.nextInt();
						temp.setAge(age);
						break;
					case 3:
						System.out.println("请输入球员的工资：");
						double salary = sc.nextDouble();
						temp.setSalary(salary);
						break;
					case 4:
						System.out.println("请输入球员的位置：");
						String location = sc.nextLine();
						temp.setLocation(location);
						break;
					case 5:
						flag = 1;
						break;
					default:
						System.out.println("选择错误");
						break;
				} // switch(choose) - case
				if (1 == flag) {
					allPlayers[index] = temp;
					System.out.println("保存退出");
					break;
				}
			} // while(true)
		} else {
			System.out.println("查无此人");
		}
		//sc.close();
	}
	public void descendingSelectSortBySalary() {
		Player[] sortArray = new Player[itemsCount];
		for (int i = 0; i < itemsCount; i++) {
			sortArray[i] = allPlayers[i];
		}
		for (int i = 0; i < itemsCount - 1; i++) {
			int index = i;
			for (int j = i + 1; j < itemsCount; j++) {
				if (sortArray[index].getSalary() < sortArray[j].getSalary()) {
					index = j;
				}
			}
			if (index != i) {
				Player temp = sortArray[index];
				sortArray[index] = sortArray[i];
				sortArray[i] = temp;
			}
		}
		showSortResult(sortArray);
	}
	public void ascendingSelectSortByAge() {
		Player[] sortArray = new Player[itemsCount];
		for (int i = 0; i < itemsCount; i++) {
			sortArray[i] = allPlayers[i];
		}
		for (int i = 0; i < itemsCount - 1; i++) {
			int index = i;
			for (int j = i + 1; j < itemsCount; j++) {
				if (sortArray[index].getAge() > sortArray[j].getAge()) {
					index = j;
				}
			}
			if (index != i) {
				Player temp = sortArray[index];
				sortArray[index] = sortArray[i];
				sortArray[i] = temp;
			}
		}
		showSortResult(sortArray);
	}
	public void showAllPlayers() {
		for (Player player : allPlayers) {
			if (null == player) {
				break;
			}
			System.out.println(player);
		}
	}
	private void grow() {
		int oldCapacity = this.allPlayers.length;
		int newCapacity = oldCapacity + oldCapacity / 2;
		Player[] newArray = new Player[newCapacity];
		for (int i = 0; i < oldCapacity; i++) {
			newArray[i] = this.allPlayers[i];
		}
		this.allPlayers = newArray;
	}
	private int findPlayerIndexByPlayerId(int playerId) {
		if (playerId < 1 || playerId > 100) {
			System.out.println("传入球员Id不合法");
			return -1;
		}
		int index = -1;
		for (int i = 0; i < itemsCount; i++) {
			if (allPlayers[i].getId() == playerId) {
				index = i;
				break;
			}
		}
		return index;
	}
	private void showSortResult(Player[] sortArray) {
		//增强for循环
		for (Player player : sortArray) {
			System.out.println(player);
		}
	}
}
