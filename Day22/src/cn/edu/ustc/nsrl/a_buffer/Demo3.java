package cn.edu.ustc.nsrl.a_buffer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * BufferedReader 缓冲区是一个char类型数组，数组元素个数为8192，占用空间大小为16kb
 * */

public class Demo3 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		readTest1();
	}
	public static void readTest1() throws FileNotFoundException, IOException {
		File file = new File("/Users/chenxin/Documents/GitHub/Java/Day22/read.txt");
		if (!file.exists() || !file.isFile()) {
			throw new FileNotFoundException();
		}
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String str = null;
		while ((str = br.readLine()) != null) {
			System.out.println(str);
		}
		br.close();
	}
}
