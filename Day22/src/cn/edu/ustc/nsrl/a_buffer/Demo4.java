package cn.edu.ustc.nsrl.a_buffer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Demo4 {

	public static void main(String[] args) throws IOException {
		writeTest1();
	}
	public static void writeTest1() throws IOException {
//		文件可以不存在
		File file = new File("/Users/chenxin/Documents/GitHub/Java/Day22/write.txt");
		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("哈哈");
		bw.newLine();
		bw.write("啦啦啦");
		bw.close();
	}
}
