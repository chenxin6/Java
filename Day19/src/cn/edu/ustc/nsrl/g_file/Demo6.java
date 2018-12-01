package cn.edu.ustc.nsrl.g_file;

import java.io.File;
import java.io.FilenameFilter;

//自定义过滤器，获得.txt文件
class MyFileter implements FilenameFilter {
	@Override
	public boolean accept(File dir, String name) {
		System.out.println("*********************");
		System.out.println(dir);
		System.out.println(name);
		return new File(dir, name).isFile() && name.endsWith(".txt");
	}
}

public class Demo6 {

	public static void main(String[] args) {
		File file = new File("E:/Program Files/eclipse-workspace/Day19");
		File[] allFiles = file.listFiles(new MyFileter());
		for (File f : allFiles) {
			System.out.println(f.getPath());
		}
//		匿名内部类的匿名对象作为方法的参数
		File[] allFiles2 = file.listFiles(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				return new File(dir, name).isFile() && name.endsWith(".txt");
			}
		});
		for (File f : allFiles2) {
			System.out.println(f.getPath());
		}
	}

}
