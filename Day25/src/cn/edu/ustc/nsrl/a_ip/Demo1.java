package cn.edu.ustc.nsrl.a_ip;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*
 * IP类 获取IP对象的方式
 * 	InetAddress
 * 	常用方法：
 * 		getLocalHost(); // 获取本机的IP地址
 * 		getByName(String address); // 可以通过计算机名或者IP地址，得到对应的IP对象
 * 		getHostAddress(); // 返回一个IP地址的字符串表示形式
 * 		getHostName(); // 返回主机名
 * 
 * */

public class Demo1 {

	public static void main(String[] args) throws UnknownHostException {
		InetAddress address = InetAddress.getLocalHost();
		System.out.println(address);
		
		InetAddress address2 = InetAddress.getByName("chenxindeMacBook-Pro.local");
		System.out.println(address2);
		System.out.println(address2.getHostAddress());
		System.out.println(address2.getHostName());
		
		InetAddress[] array = InetAddress.getAllByName("www.baidu.com");
		for (InetAddress temp : array) {
			System.out.println(temp);
		}
		
	}

}
