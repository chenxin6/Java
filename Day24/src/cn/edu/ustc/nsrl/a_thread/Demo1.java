package cn.edu.ustc.nsrl.a_thread;

import org.junit.Test;

class VideoThread extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("视频中。。。");
		}
	}
}
class ChatThread extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("聊天中。。。");
		}
	}
}

public class Demo1 {
	@Test // 测试代码
	public void test1() {
		VideoThread vt = new VideoThread();
		ChatThread ct = new ChatThread();
		vt.start();
		ct.start();
	}
}
