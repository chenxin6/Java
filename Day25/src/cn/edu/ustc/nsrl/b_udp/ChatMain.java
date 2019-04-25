package cn.edu.ustc.nsrl.b_udp;

public class ChatMain {

	public static void main(String[] args) {
		ChatSender sender = new ChatSender();
		ChatReceiver receiver = new ChatReceiver();
		sender.start();
		receiver.start();
	}

}
