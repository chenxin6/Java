package cn.edu.ustc.nsrl.a_thread;

/*
 * 开发中的死锁现象
 * 为什么会出现死锁：（四要素）
 * 	一，资源不能共享，有且仅有一个进程能够占有该资源
 * 	二，一个进程不能抢占另一个进程的资源
 * 	三，一个进程因请求资源而阻塞导致所持有的资源不释放
 * 	四，形成循环等待的关系
 * 坚决不能有死锁
 * */

class DeadLock extends Thread {
	public DeadLock(String name) {
		super(name);
	}
	@Override
	public void run() {
		if (Thread.currentThread().getName().equals("小胖")) {
			synchronized ("电池") {
				System.out.println("小胖有电池，想要遥控器");
				synchronized ("遥控器") {
					System.out.println("小胖拿到了遥控器，打开了投影仪");
				}
			}
		} else if (Thread.currentThread().getName().equals("逗比")) {
			synchronized ("遥控器") {
				System.out.println("逗比有遥控器，想要电池");
				synchronized ("电池") {
					System.out.println("逗比拿到了电池，打开了投影仪");
				}
			}
		}
	}
}

public class Demo4 {

	public static void main(String[] args) {
		DeadLock d1 = new DeadLock("小胖");
		DeadLock d2 = new DeadLock("逗比");
		
		d1.start();
		d2.start();
	}

}
