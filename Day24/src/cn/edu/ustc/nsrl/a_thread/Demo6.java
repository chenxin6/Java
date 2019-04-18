package cn.edu.ustc.nsrl.a_thread;

/*
 * 守护线程（后台线程）
 * 例如：
 * 	软件的Log日志文件，软件的自动更新，软件的自动下载
 * 特征：
 * 	如果整个程序在运行过程中，只剩下一个守护线程，那么这个守护线程也就没有意义了，会自动停止
 * JVM的垃圾回收机制就是守护线程
 * */

public class Demo6 extends Thread {
	public Demo6(String name) {
		super(name);
	}
	// 模拟后台下载更新的线程
	@Override
	public void run() {
		for (int i = 0; i <= 100; i++) {
			System.out.println("软件更新下载中。。。。。" + i + "%");
			if (i == 100) {
				System.out.println("软件更新下载完成，是否安装？");
			}
			try {
				sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		Demo6 d = new Demo6("后台线程");
		// 设置当前线程为守护线程后者是后台线程
		d.setDaemon(true);
		
		System.out.println(d.isDaemon());
		d.start();
		for (int i = 0; i <= 50; i++) {
			sleep(10);
			// 这里我们会发现主线程结束后，虽然后台线程没有运行完但是还是被强行结束了
			System.out.println("主线程：" + i);
		}
	}

}
