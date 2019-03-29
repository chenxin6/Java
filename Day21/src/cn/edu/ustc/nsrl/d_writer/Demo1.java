package cn.edu.ustc.nsrl.d_writer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 输出字符流：
 * ---| Writer 输出字符流的基类/超类 抽象类
 * ------| FileWriter 文件操作的输出字符流
 * 操作流程：
 * 一，找到目标文件
 * 二，建立输出管道
 * 三，写入数据
 * 四，关闭资源
 * 发现一，如果写入的数据不多，程序如果中止，在目标文件中没有任何的数据，
 * 当程序继续运行，数据会写入到文件中
 * 发现二，如果写入数据很大，程序如果中止，可能会在目标文件中写入一部分数据，
 * 当程序继续运行，之后的数据也会写入到文件中
 * 
 * Java字符流的一个特征：
 * 目的是减少对于磁盘的写入操作，写入数据到硬盘是对硬盘有一定损耗的。
 * Java中就是用了一种缓冲机制，当调用FileWriter的writer方法，并不是直接写入数据到硬盘，
 * 而是先保存在FileWriter类对象里面的缓冲区中，这个缓冲区是一个【字符数组】，这个数组默认的元素格式【1024个字符】
 * 有三种情况，可以直接把数据写入到文件中：
 * 一，关闭FileWriter资源
 * 二，缓冲区满了，会直接清空缓冲区，把数据写入到硬盘中
 * 三，调用flush方法，立即清空缓冲区，直接写入数据到硬盘
 * 
 * 注意事项：
 * 一，FileWriter在操作文件时，如果文件不存在，而且文件夹权限允许，可以直接创建文件
 * 如果想要追加写，调用FileWriter(File file, boolean append)
 * 二，使用字符流进行复制的时候文件有可能会出现字符个数变少了导致文件被破坏
 * 是因为使用字符流读取数据时，数据会进行一个解码的过程，根据当前系统规定默认字符集进行解码
 * 而在解码的过程中，如果解码的数据不能和当前字符集里面的数据进行匹配，那么对于字符流来说这个无效数据会被扔掉
 * 所以字节流可以用在所有的文件操作中，而字符流只能用在txt文件可以打开的可视化文件中
 * 
 * */

public class Demo1 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		writerTest1();
	}
	public static void writerTest1() throws FileNotFoundException, IOException {
		File file = new File("/Users/chenxin/Documents/GitHub/Java/Day21/write.txt");
		FileWriter fw = new FileWriter(file);
		String str = "又是美好的一天\n";
		fw.write(str);
		
		fw.close();
	}
	
}
