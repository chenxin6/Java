package cn.edu.ustc.nsrl.b_udp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class ChatSender extends Thread {
	@Override
	public void run() {
		try {
			DatagramSocket socket = new DatagramSocket();
			// System.in是键盘，这里是把一个输入字节流对象做成一个输入字符流对象，
			// 提供给缓冲字符流作为读写的能力
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String line = null;
			DatagramPacket packet = null;
			while ((line = reader.readLine()) != null) {
				packet = new DatagramPacket(line.getBytes(), line.getBytes().length, 
						InetAddress.getByName("127.0.0.1"), 8888);
				socket.send(packet);
			}
			socket.close();
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
