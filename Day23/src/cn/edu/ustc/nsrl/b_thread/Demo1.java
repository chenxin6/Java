package cn.edu.ustc.nsrl.b_thread;

/*
 * 多线程和多进程：
 * 	线程：在一个软件中，负责不同功能的子程序，称之为线程
 * 	进程：是在计算机系统所有正在运行的程序，都可以看作是一个进程。多进程的操作系统
 * 
 * 计算机问题：
 * 	Windows操作系统是一个多任务的操作系统，为什么Windows可以同时执行多任务？？？
 * 	从表面上看：Windows的确可以同时执行不同的应用程序
 * 	从实际出发：CPU一次只能做一件事情，但是执行力很强，每一个CPU的内核在一个时间片内只能执行一件事情。但是
 * 	这个时间片非常的短，不同的程序会出现在不同的时间片上，不断的切换所以你感觉是在同时运行
 * 
 * 一个Java程序在运行的时候，最少有两个线程，一个是main主线程，一个是JVM的垃圾回收机制
 * 多线程的好处：
 * 	一，可以让一个程序同时执行不同的任务
 * 	二，可以提高资源的利用率
 * 多线程的弊端：
 * 	一，线程安全问题
 * 	二，增加了CPU负担
 * 	三，降低了其他程序CPU的执行概率
 * 	四，容易出现死锁行为
 * 如何创建一个线程：
 * 	方式一：
 * 		一，自定义一个类继承Thread类，那么这个类就可以看作是一个多线程类
 * 		二，要求重写Thread类里面的run方法，把需要执行的自定义线程代码放入这个run方法（就是要求线程运行的程序）
 * 			注意调用的时候要用的是start
 * 
 * */

class MyThread extends Thread {
//	要求重写run方法
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("自定义Thread类" + i);
		}
	}
}

public class Demo1 {

	public static void main(String[] args) {
		// 一，创建自定义线程类的类对象
		MyThread mt = new MyThread();
		// 二，启动线程
		// 这个只是调用run方法，相当于调用了一个普通的方法，而不是一个线程
//		mt.run();
		// 这个才是真正启动线程
		mt.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("main线程" + i);
		}
	}

}
