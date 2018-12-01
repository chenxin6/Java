package cn.edu.ustc.nsrl.g_file;

import java.io.File;

public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("E:/Program Files/eclipse-workspace/Day19/aaa.txt");
		System.out.println("这个文件或者文件夹存在吗？" + file.exists());
		System.out.println("这个File类对象是一个文件类对象吗？" + file.isFile());
		System.out.println("这个File类对象是一个文件夹类对象吗？" + file.isDirectory());
//		使用匿名对象
		System.out.println("这个File类对象是一个文件夹类对象吗？" + new File("E:/Program Files/eclipse-workspace/Day19/aaa.txt").isDirectory());
		System.out.println("这个File类对象是一个隐藏文件对象吗？" + file.isHidden());
		System.out.println("创建File类对象使用了绝对路径吗？" + file.isAbsolute());
	}

}
