package cn.edu.ustc.nsrl.b_udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class ChatReceiver extends Thread {
	@Override
	public void run() {
		DatagramSocket socket = null;
		try {
			socket = new DatagramSocket(8888);
			byte[] buf = new byte[1024];
			DatagramPacket packet = new DatagramPacket(buf, buf.length);
			while (true) {
				socket.receive(packet);
				System.out.println(packet.getAddress().getHostAddress()
						+ ":" + new String(buf, 0, packet.getLength()));
			}
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (socket != null) {
				socket.close();
			}
		}

	}
}
