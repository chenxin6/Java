package cn.edu.ustc.nsrl.a_buffer;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo2 {

	public static void main(String[] args) throws IOException {
		writeTest1();
	}
	public static void writeTest1() throws IOException {
//		文件可以不存在
		File file = new File("/Users/chenxin/Documents/GitHub/Java/Day22/write.txt");
		FileOutputStream fos = new FileOutputStream(file);
		BufferedOutputStream bs = new BufferedOutputStream(fos);
		String str = "adfhahdfjdsh";
		bs.write(str.getBytes());
		bs.close();
//		fos不用单独关闭，因为缓冲流的close会关闭输出字节流
	}
}
