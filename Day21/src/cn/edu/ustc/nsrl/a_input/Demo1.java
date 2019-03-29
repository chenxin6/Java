package cn.edu.ustc.nsrl.a_input;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * 按照处理的数据单位来做划分有
 * 字节流：完完全全按照二进制编码格式，一个字节一个字节获取
 * 输入字节流（读取数据操作）
 * ---| InputStream 所有字节流的基类/父类 抽象类
 * ------| FileInputStream 读取文件的输入字节流
 * 操作步骤：
 * 	一，找到文件
 * 	二，创建FileInputStream输入管道
 * 	三，读取文件
 * 	四，关闭管道
 * 
 * 字符流：其实也是字节操作，但是会考虑当前系统的编码问题
 * 		  会将读取的字节数据根据当前使用的字符集进行翻译
 * 字符流 = 字节流 + 解码
 * 
 * */
public class Demo1 {
	public static void main(String[] args) throws IOException {
		readTest4();
	}
	public static void readTest1() throws FileNotFoundException, IOException {
		File file = new File("/Users/chenxin/Documents/GitHub/Java/Day21/a.txt");
		if (!file.exists() || !file.isFile()) {
			throw new FileNotFoundException();
		}
		FileInputStream fs = new FileInputStream(file);
		int content = fs.read(); //只能读取一个字节，会抛出IOException异常
		System.out.println((char) content);
		fs.close(); //关闭资源，否则会占用句柄Handle，句柄是用来操作文件的，它有数量限制
	}
	public static void readTest2() throws FileNotFoundException, IOException {
		File file = new File("/Users/chenxin/Documents/GitHub/Java/Day21/a.txt");
		if (!file.exists() || !file.isFile()) {
			throw new FileNotFoundException();
		}
		FileInputStream fs = new FileInputStream(file);
		int content = fs.read(); //只能读取一个字节，会抛出IOException异常
		//读取到文件末尾的时候会返回-1
		while (content != -1) {
			System.out.print((char) content);
			content = fs.read();
		}
		fs.close(); //关闭资源，否则会占用句柄Handle，句柄是用来操作文件的，它有数量限制
	}
	public static void readTest3() throws FileNotFoundException, IOException {
		File file = new File("/Users/chenxin/Documents/GitHub/Java/Day21/a.txt");
		if (!file.exists() || !file.isFile()) {
			throw new FileNotFoundException();
		}
		FileInputStream fs = new FileInputStream(file);
		byte[] buffer = new byte[1024]; //只能读取指定字节个数的文件内容！！！
		int length = fs.read(buffer); //字节缓冲区，length是字节个数，速度比一个字节一个字节读取快
		System.out.println(new String(buffer) + length);
		fs.close(); //关闭资源，否则会占用句柄Handle，句柄是用来操作文件的，它有数量限制
	}
	public static void readTest4() throws FileNotFoundException, IOException {
		long start = System.currentTimeMillis();
		File file = new File("/Users/chenxin/Documents/GitHub/Java/Day21/a.txt");
		if (!file.exists() || !file.isFile()) {
			throw new FileNotFoundException();
		}
		FileInputStream fs = new FileInputStream(file);
		byte[] buffer = new byte[1024]; //只能读取指定字节个数的文件内容！！！
		int length = fs.read(buffer); //字节缓冲区，length是字节个数
		while (length != -1) {
			System.out.println(new String(buffer) + length);
			length = fs.read(buffer);
		}
		fs.close(); //关闭资源，否则会占用句柄Handle，句柄是用来操作文件的，它有数量限制
		long end = System.currentTimeMillis();
		System.out.println("耗时：" + (end - start));
	}
}
