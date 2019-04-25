package cn.edu.ustc.nsrl.c_tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Demo1Server {

	public static void main(String[] args) throws IOException {
		// 一，使用ServerSocket开始TCP服务器，监听指定端口，准备捕获从客户端申请Socket连接
		ServerSocket serverSocket = new ServerSocket(8000);
		// 二，接受客户端连接，得到客户端的Socket对象
		Socket socket = serverSocket.accept();
		// 三，获取从客户端得到的Socket对象的输入流
		InputStream is = socket.getInputStream();
		byte[] buf = new byte[1024];
		int length = is.read(buf);
		System.out.println("客户端说：" + new String(buf, 0, length));
		// 四，获取Socket的输出流对象，给客户端发送数据
		OutputStream os = socket.getOutputStream();
		os.write("你好，客户端".getBytes());
		// 五，关闭ServerSocket就是关闭TCP协议下的服务器程序
		serverSocket.close();
	}

}
