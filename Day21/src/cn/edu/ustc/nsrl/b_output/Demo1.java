package cn.edu.ustc.nsrl.b_output;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 写入文件的操作流程
 * 	一，找到要操作的文件，文件可以不存在，但要求操作的文件必须有后缀名（除非上锁的文件即标记）
 * 	二，创建输出管道
 * 	三，写入数据
 * 	四，关闭资源
 * 
 * ---| OutputStream 所有输出字节流的基类，父类，抽象类
 * ------| FileOutputStream 文件输出字节流
 * FileOutputStream的注意事项：
 * 	一，写入数据到文件中时该文件可以不存在，因为FileOutputStream有创建文件的能力，由于有些文件夹底下
 * 		是没有创建权限的，所以在创建输出管道的时候有可能会抛出异常
 * 	二，默认情况下FileOutputStream采用覆盖写入数据的方式，如果想要使用追加写需要传入第二个参数为true
 * 		或者在调用write时传入模式
 * 	三，小写字母a ascii码是97，如果传入353的话其实写入的也是a因为353 = 256 + 97
 * */

public class Demo1 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		writeTest2();
	}
	public static void writeTest1() throws FileNotFoundException, IOException {
		File file = new File("/Users/chenxin/Documents/GitHub/Java/Day21/write.txt");
		//在创建管道的时候就创建了文件，第二个参数为true时为添加写，false时为覆盖写，默认是false
		FileOutputStream fos = new FileOutputStream(file, true);
		//写入的int数据是int类型的低八位
		fos.write('H');
		fos.write('e');
		fos.write('l');
		fos.write('l');
		fos.write('o');
		fos.write(' ');
		fos.write('W');
		fos.write('o');
		fos.write('r');
		fos.write('l');
		fos.write('d');
		fos.close();
	}
	public static void writeTest2() throws FileNotFoundException, IOException {
		File file = new File("/Users/chenxin/Documents/GitHub/Java/Day21/write.txt");
		//在创建管道的时候就创建了文件，第二个参数为true时为添加写，false时为覆盖写，默认是false
		FileOutputStream fos = new FileOutputStream(file, true);
		String str = "hahahah\n";
		byte[] buffer = str.getBytes();
		fos.write(buffer);
		fos.close();
	}
}
