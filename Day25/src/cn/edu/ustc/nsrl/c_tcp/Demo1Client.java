package cn.edu.ustc.nsrl.c_tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

/*
 * UDP特征：
 * 一，数据是以数据包形式发送，面向无连接
 * 二，每一个数据包的大小都是限制在64KB以内
 * 三，因为无连接，所以不可靠
 * 四，因为无连接，所以速度快
 * 五，UDP不区分客户端和服务端，只有发送端和接收端
 * 用途：网络游戏，视频直播
 * 
 * TCP特征：
 * 一，TCP是完全基于IO流进行数据传输的，面向连接
 * 二，TCP进行数据传递没有显示数据包的大小
 * 三，TCP面向连接，必须通过三次握手之后才能保证数据的传输通道是完整的
 * 四，TCP面向连接，速度较慢
 * 五，TCP是区分客户端和服务端
 * 用途：QQ聊天，软件登陆，FeiQ文件传输是TCP，迅雷下载
 * 
 * TCP协议下的Socket
 * 	// 创建TCP协议下的客户端，并且申请连接服务器
 * 	Socket(服务器IP地址对象, 服务器软件对应的端口);
 *	// 服务器的Socket开始服务器服务，准备捕获Socket
 * 	ServerSocket();
 * 
 * TCP客户端的流程：
 * 一，建立TCP客户端连接，申请连接服务器，需要服务器IP地址对象和对应的程序端口号
 * 二，获取对应的流对象
 * 三，写入或者读取数据
 * 四，关闭资源
 * */

public class Demo1Client {
	public static void main(String[] args) throws IOException {
		// 一，建立客户端Socket，申请连接服务器
		Socket socket = new Socket(InetAddress.getLocalHost(), 8000);
		// 二，发送数据给服务器，需要获取Socket的输出流对象
		OutputStream os = socket.getOutputStream();
		// 使用OutputStream方法发送数据到服务器，也就是输出数据
		os.write("hah".getBytes());
		// 三，获取Socket的InputStream，即用来接收服务器那里发来的数据
		InputStream is = socket.getInputStream();
		byte[] buf = new byte[1024];
		int length = is.read(buf);
		System.out.println("服务器：" + new String(buf, 0, length));
		socket.close();
	}
	
}
