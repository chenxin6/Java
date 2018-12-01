package cn.edu.ustc.nsrl.g_file;

import java.io.File;

/*
 * 在只考虑文件操作情况下：
 * 	读取操作是从硬盘（存储设备）到内存
 * 	写入操作是从内存到硬盘（存储设备）
 * 如何创建一个File类对象：
 * 	File(String pathName);
 * 	根据文件路径创建File类对象，可以使用绝对路径和相对路径
 * 	
 * 	File(String parent, String child);
 * 	根据提供的父目录的文件夹地址，和当前文件夹下的子文件或者子文件夹创建File类对象
 * 	
 * 	File(File parent, String child);
 * 	根据创建好的父目录的File类对象，和这个目录下的子文件或者子文件夹来创建File类对象
 * */

public class Demo1 {
	public static void main(String[] args) {
		File file1 = new File("E:\\Program Files\\eclipse-workspace\\Day19");
		File file2 = new File("E:/Program Files/eclipse-workspace/Day19");
		File file3 = new File("E:" + File.separator + "Program Files" 
		+ File.separator + "eclipse-workspace" + File.separator + "Day19");
		
		System.out.println(file1);
		System.out.println(file1.exists());
		System.out.println(file2);
		System.out.println(file3);
		
		File file4 = new File("E:/Program Files/eclipse-workspace/Day19", "aaa.txt");
		System.out.println(file4);
		System.out.println(file4.exists());
		
		File file5 = new File(file1, "aab.txt");
		System.out.println(file5);
		System.out.println(file5.exists());
		
	}
}
