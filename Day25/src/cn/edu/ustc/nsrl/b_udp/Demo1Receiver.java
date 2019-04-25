package cn.edu.ustc.nsrl.b_udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/*
 * 接收端
 * 	一，建立UDP服务，监听端口
 * 	二，准备空数据包，用来接收数据
 * 	三，调用UDP服务接收数据
 * 	四，获取数据
 * 	五，释放资源
 * */

public class Demo1Receiver {

	public static void main(String[] args) throws SocketException, IOException {
		// 一，建立UDP服务，监听端口
		DatagramSocket socket = new DatagramSocket(8888);
		// 二，准备空数据包，用来接收数据，利用byte数据创建空数据包
		byte[] buf = new byte[1024];
		DatagramPacket packet = new DatagramPacket(buf, buf.length);
		// 三，调用UDP服务，使用Socket接收数据
		socket.receive(packet);
		// 四，从数据包中获取Socket接收到的数据
		// 所有的数据都会被保存在byte数组中，然后可以通过调用UDP数据包的getLength方法，
		// 获取到接收到的数据字节长度
		System.out.println(new String(buf, 0, packet.getLength()));
		// 五，关闭资源
		socket.close();
	}

}
