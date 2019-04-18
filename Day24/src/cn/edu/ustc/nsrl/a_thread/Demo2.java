package cn.edu.ustc.nsrl.a_thread;

/*
 * 线程中的常用方法
 * Thread(String name); 初始化线程的名字，属于线程的一个有参数的构造方法
 * setName(String name); 修改线程的名字
 * getName(); 获取线程的名字
 * sleep(); static静态方法，通过Thread类名调用，这里需要处理一些异常，要求当前线程睡觉多少毫米
 * currentThread(); static静态方法，返回当前线程对象
 * getPriority(); 返回当前线程的优先级CPU执行的优先级，不是绝对的
 * setPriority(); 设置线程的优先级，线程的优先级返回是1～10，1最低
 * 这里的优先级只是提高了当前线程拥有CPU执行权概率，并不能完全保证当前线程能够一定会占有更多的CPU时间
 * 线程的默认优先级为5
 * 
 * Thread[main,5,main]
 * Thread[Thread-0,5,main]
 * Thread[线程名,优先级,线程组名]
 * */

public class Demo2 extends Thread {
	public Demo2(String name) {
		super(name);
	}
	@Override
	public void run() {
		// 这里是Demo2线程对象的线程代码
		System.out.println("Demo2" + Thread.currentThread());
		for (int i = 0; i < 20; i++) {
			System.out.println("自定义线程");
			/*
			 * 在其他方法中，使用sleep可以抛出也可以捕获，但是run方法中只能捕获
			 * 理由：这是一个语法规则，在Java中，重写父类的方法，要求和父类的方法声明一摸一样，
			 * 在Thread类中run方法没有抛出异常，所以在子类中，你也不能抛出异常，要和父类一致
			 * wait和sleep的区别
			 * 如果一个线程执行了wait方法，那么就需要其他线程把他唤醒，从而回到可执行状态
			 * 唤醒的方法是notify
			 * */
			try {
				sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
	}
	public static void main(String[] args) throws InterruptedException {
		// 这里是main线程
		Demo2 d = new Demo2("狗蛋");
		d.setName("哈哈");
		System.out.println(d.getName());
		d.setPriority(2);
		d.start(); // 开启自定义线程，执行自定义线程中的run方法里面的功能
		System.out.println("main" + Thread.currentThread());
		for (int i = 0; i < 20; i++) {
			System.out.println("main线程");
			sleep(100);
		}
	}

}
