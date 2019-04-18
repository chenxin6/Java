package cn.edu.ustc.nsrl.a_thread;

/*
 * Java语言是一种单继承，多实现【遵从】面向对象的语言
 * 自定义线程的方式：
 * 	方式1:
 * 		一，自定一个类，继承Thread类
 * 		二，重写Thread里面的run方法，把线程的功能代码放入到run方法中
 * 		三，创建自定义线程类对象
 * 		四，开启线程，使用start方法
 * 	弊端：
 * 		因为Java是一个单继承的语言，一旦某一个类继承了Thread类就无法再继承其他类，
 * 		或者说一个类继承了其他类，也就没有办法继承Thread类
 * 	方式2:（强烈推荐）
 * 		遵从Runnable接口实现自定义线程类
 * 		一，自定义一个类，遵从Runnable接口
 * 		二，实现Runnable接口中唯一要求的方法run方法，把线程的功能代码写入到run方法中
 * 		三，创建Thread类对象，并且把遵从Runnable接口的自定义类对象，作为参数传入到Thread构造方法中
 * 		四，调用Thread类对象的start方法，开启线程
 * */

class TestRunnable implements Runnable {
	// 实现自定义线程类，遵从Runnable接口要求实现的run方法，把线程代码写入到run里面
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("当前线程为" + Thread.currentThread());
		}
	}
}

public class Demo5 {

	public static void main(String[] args) {
		// 创建Thread类对象，调用Thread构造方法中，需要传入遵从Runnable接口的类对象
		Thread t1 = new Thread(new TestRunnable());
		// 匿名内部类的匿名对象
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println("匿名内部类的匿名对象，作为方法的参数，这里是作为线程对象的参数"
							+ Thread.currentThread());
				}
			}
		});
		
		t1.start();
		t2.start();
	}

}
