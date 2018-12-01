package cn.edu.ustc.nsrl.g_file;

import java.io.File;
import java.io.IOException;

/*
 * boolean delete();
 * 	删除文件或者文件夹，但是如果操作文件夹的话，只能删除空文件夹
 * 	成功返回true，失败返回false
 * 	该删除操作不可逆，因为是直接从磁盘上抹去数据
 * 
 * void deleteOnExit();
 * 	当JVM虚拟机运行终止后，删除指定的文件或者文件夹，而不是调用立即删除
 * 	用途：用于删除程序运行结束之后残留的缓存文件，或者运行日志文件，节约磁盘空间
 * */

public class Demo3 {
	public static void main (String[] args) throws IOException {
		File file1 = new File("E:/Program Files/eclipse-workspace/Day19/demo31.txt");
		boolean ret = file1.createNewFile();
		System.out.println(ret);
		ret = file1.delete();
		System.out.println(ret);
	}
}
