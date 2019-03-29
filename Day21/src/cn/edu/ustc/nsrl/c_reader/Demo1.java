package cn.edu.ustc.nsrl.c_reader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * 字符流读取数据，输入字符流
 * ---| Reader 输入字符流的基类/超类 抽象类
 * ------| FileReader 读取文件的输入字符流	
 * 使用方式：
 * 	一，找到文件
 * 	二，建立FileReader读取管道
 * 	三，读取数据
 * 	四，关闭资源
 * 
 * */

public class Demo1 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		long start = System.currentTimeMillis();
		readerTest1();
		long end = System.currentTimeMillis();
		System.out.println("耗时：" + (end - start));
	}
	public static void readerTest1() throws FileNotFoundException, IOException {
		File file = new File("/Users/chenxin/Documents/GitHub/Java/Day21/a.txt");
		if (!file.exists() || !file.isFile()) {
			throw new FileNotFoundException();
		}
		FileReader fr = new FileReader(file);
		//读取数据
		int content = fr.read();
		while (content != -1) {
			System.out.println((char) content);
			content = fr.read();
		}
		fr.close();
	}
	public static void readerTest2() throws FileNotFoundException, IOException {
		File file = new File("/Users/chenxin/Documents/GitHub/Java/Day21/a.txt");
		if (!file.exists() || !file.isFile()) {
			throw new FileNotFoundException();
		}
		FileReader fr = new FileReader(file);
		//读取数据
		char[] buffer = new char[1024];
		int length = fr.read(buffer);
		while (length != -1) {
			System.out.println(new String(buffer));
			length = fr.read(buffer);
		}
		fr.close();
	}
}
