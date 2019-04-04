package cn.edu.ustc.nsrl.b_javaAPI;

import java.io.IOException;
import java.util.Properties;

public class Demo2 {

	public static void main(String[] args) throws IOException, InterruptedException {
		// 属性 获取系统属性
		Properties ps = System.getProperties();
		// 属性的展示方式
		ps.list(System.out);
		// 获取属性里面的内容
		String username = System.getProperty("user.name");
		System.out.println(username);
		
		// 获取软件的运行环境
		Runtime run = Runtime.getRuntime();
		System.out.println("当前空余内存：" + run.freeMemory());
		System.out.println("JVM只能使用的总内存：" + run.totalMemory());
		System.out.println("JVM试图使用的总内存：" + run.maxMemory());
		
//		// 运行命令，会抛出异常
//		Process notepad = run.exec("notepad");
//		// 这句也会抛出异常
//		Thread.sleep(10000);
//		// 结束程序
//		notepad.destroy();
	}

}
