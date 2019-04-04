package cn.edu.ustc.nsrl.a_buffer;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * 通过缓冲使用字符流和字节流时间效率更高
 * 字节缓冲流和字符缓冲流
 * ---| InputStream 输入字节流的基类/超类 抽象类
 * ------| FileInputStream 文件操作的字节输入流	
 * ------| BufferedInputStream 缓冲输入字节流，在缓冲字节流对象中，底层维护了一个8kb缓冲字节数组
 * 
 * 构造方法：
 * 	BufferedInputStream(InputStream in);
 * 	BufferedInputStream(InputStream in, int size);
 * 构造方法中都有一个参数是InputStream，要求传入的是InputStream的子类对象，第二个构造方法中多了一个
 * 参数是int size，这个size表示设置缓冲区的大小，默认大小是8kb
 * 构造方法中的InputStream是给缓冲流提供读写能力的！！！因为缓冲流是没有读写能力的
 * 使用流程：
 * 	找到目标文件
 * 	建立管道
 * 		首先创建当前文件的InputStream的子类对象FileInputStream
 * 		然后使用这个子类对象作为BufferedInputStream构造方法参数，创建缓冲流对象
 * 	读取数据
 * 	关闭资源
 * 	
 * */

public class Demo1 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		readTest1();
	}
	public static void readTest1() throws FileNotFoundException, IOException {
		File file = new File("/Users/chenxin/Documents/GitHub/Java/Day22/read.txt");
		if (!file.exists() || !file.isFile()) {
			throw new FileNotFoundException();
		}
		FileInputStream fis = new FileInputStream(file);
		BufferedInputStream bs = new BufferedInputStream(fis);
		BufferedInputStream bs2 = new BufferedInputStream(new FileInputStream(
				new File("/Users/chenxin/Documents/GitHub/Java/Day22/read.txt")));
		int length = -1;
		byte[] buffer = new byte[512];
		while ((length = bs.read(buffer)) != -1) {
			System.out.println(new String(buffer, 0, length));
		}
		bs2.close();
		bs.close();
//		在上一句中已经会自动关闭fis了，所以就不用再关闭了
//		fis.close();
	}
}
