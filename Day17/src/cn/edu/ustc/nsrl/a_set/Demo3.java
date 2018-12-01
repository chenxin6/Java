package cn.edu.ustc.nsrl.a_set;

import java.util.HashSet;
import java.util.Scanner;

class Account {
	String userName;
	String passWord;
	
	public Account() {}
	public Account(String userName, String passWord) {
		this.userName = userName;
		this.passWord = passWord;
	}
	
	@Override
	public boolean equals(Object obj) {
		Account acc = (Account) obj;
		return this.userName.equals(acc.userName);
	}
	
	@Override
	public int hashCode() {
		return this.userName.hashCode();
	}
	
}

public class Demo3 {

	public static void main(String[] args) {
		HashSet set = new HashSet();
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("请输入用户名");
			String userName = sc.nextLine();
			
			System.out.println("请输入密码");
			String passWord = sc.nextLine();

			Account account = new Account(userName, passWord);
			if (set.add(account)) {
				System.out.println("注册成功");
			} else {
				System.out.println("用户名已经存在！！！注册失败！！！");
			}
		}
	}

}
