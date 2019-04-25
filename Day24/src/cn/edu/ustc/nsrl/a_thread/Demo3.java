package cn.edu.ustc.nsrl.a_thread;

/*
 * 线程的共享资源问题
 * 考虑以下情景：动物园卖票50张，3个窗口售卖
 * Java中的线程同步机制：
 * 方式1:
 * 	同步代码块：
 * 	格式：
 * 		synchronized (锁对象) {
 * 			需要同步的代码；
 * 		}
 * 	同步代码块的注意事项：
 * 	一，锁对象，可以是任意的一个对象（字符串都可以），但是必须是同一个对象，不能在这里使用new来创建匿名对象
 * 	二，sleep不会释放锁对象，不会开锁，例如：厕所有人关门睡着了
 * 	三，使用synchronized同步代码块的时候，必须是真正意义上存在共享资源的线程问题，才会使用而且通常情况下，
 *  用synchronized锁住的代码越少越好，提高代码执行效率
 * */

class SaleTicket extends Thread {
	// 即便是使用静态成员变量存储票数，还是有可能会出现一张票出售多次的现象
	// 原因是窗口1在卖票的时候，还没有运行到ticket--这条语句的时候，下一个窗口2开始执行卖票算法
	// 这里窗口2卖的票是窗口1还没有ticket--的票，所以发生了重复
	// 处理方式：上锁
	private static int ticket = 50;
	public SaleTicket(String name) {
		super(name);
	}
	@Override
	public void run() {
		while (true) {
			synchronized ("你好") {
				if (ticket > 0) {
						System.out.println(Thread.currentThread().getName() + " " + ticket);
				} else {
					System.out.println("卖完了");
					break;
				}
				ticket--;
			}
		}
	}
}

public class Demo3 {

	public static void main(String[] args) {
		SaleTicket s1 = new SaleTicket("窗口1");
		SaleTicket s2 = new SaleTicket("窗口2");
		SaleTicket s3 = new SaleTicket("窗口3");
		s1.start();
		s2.start();
		s3.start();
	}

}
