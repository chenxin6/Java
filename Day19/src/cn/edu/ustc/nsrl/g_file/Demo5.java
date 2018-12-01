package cn.edu.ustc.nsrl.g_file;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * 以下方法和文件是否存在无关
 * getName(); //获取路径中的文件名和文件夹名
 * getPath(); //获取File类对象里面保存的路径
 * getAbsolutePath(); //获取File类对象里面保存的路径对应的绝对路径
 * getParent(); //获取当前文件或者文件夹的父目录，如果没有返回null
 * 
 * lastModified(); //文件最后的修改时间
 * length(); //文件的大小（字节数），如果文件不存在，或者是一个文件夹，返回0L
 * 
 * static File[] listRoots(); //获取当前计算机中所有的盘符，针对Windows操作系统
 * Linux/UNIX没有区分盘符的概念，只有一个根目录 /
 * 
 * String[] list(); //获取指定文件夹里面所有子文件和子文件夹，返回一个String类型的数组（路径）
 * File[] listFiles(); //作用同上只不过返回的类型不同而已
 * */

public class Demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("E:/Program Files/eclipse-workspace/Day19/aaa.txt");
		System.out.println(file.getName());
		System.out.println(file.getPath());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getParent());
		Date date = new Date(file.lastModified());
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(file.lastModified());
		System.out.println(format.format(date));
		System.out.println(file.length());
		System.out.println("**************************");
		File[] roots = File.listRoots();
		for (File f : roots) {
			System.out.println(f.getPath());
		}
		String[] strList = new File(file.getParent()).list();
		for (String str : strList) {
			System.out.println(str);
		}
		System.out.println("**************************");
		File[] fileList = new File(file.getParent()).listFiles();
		for (File f : fileList) {
			System.out.println(f.getName());
		}
	}

}
