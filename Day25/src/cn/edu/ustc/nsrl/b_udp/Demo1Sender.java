package cn.edu.ustc.nsrl.b_udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

/*
 * Socket 套接字/插座
 * 在网络编程中所有的数据传递都是依赖于Socket来完成的，要求进行通信的两台计算机都要安装有Socket
 * 不同的传输协议有不同的Socket
 * UDP协议下的Socket
 * 一，把数据封装成一个数据包，面向无连接  广播站和收音机
 * 二，UDP数据包大小限制在64KB以内
 * 三，因为是无连接，所以是不靠谱
 * 四，因为是无连接，所以传输速度快
 * 五，UDP不区分服务端和客户端，只有发送端和接收端
 * 
 * UDP下的Socket使用：
 * 	DatagramSocket(); 获取UDP的Socket
 * 	DatagramPacket(byte[] buf, int length, InetAddress address, int port);
 * 		UDP传输的数据包
 * 			buf:要打包的数据，要求数据类型是byte类型数组
 * 			length:要打包数据的字节个数
 * 			address:发送目标地址的IP对象
 * 			port:端口号
 * 		端口号：是在系统当中，每一个执行的程序都有一个唯一的编号，这个编号就是端口号，发送的数据到当前电脑，
 * 		根据不同的端口号，来发送给不同的应用程序，端口号是从0～65535，其中0～1023是不能使用的，这些端口号
 * 		是绑定了系统服务的，1024～65535随便用
 * 
 * UDP协议丢包，也就是丢失数据，有两种情况：
 * 一，网络带宽不够
 * 二，电脑处理能力不行
 * 
 * 每一个程序都有自己处理网络数据的方式和方法，如果一个程序接受到的数据不是自己能够处理的方式，
 * 那么这个数据会被认为是垃圾数据处理，每一个程序都会有自己加密数据的方式和方法
 * 以FeiQ为例，它是基于UDP的数据传输，它的数据格式如下
 * version:time:sender:ip:flag:content
 * 版本号 时间 发送人 IP地址 32 内容
 * */

public class Demo1Sender {

	public static void main(String[] args) throws SocketException, UnknownHostException, IOException {
		// 一，建立UDP服务，打开UDP协议下的Socket，发送端Socket创建不需要任何参数
		DatagramSocket socket = new DatagramSocket();
		// 二，准备数据
		String data = "今天冬至，大家记得吃饺子～～";
		// 三，数据打包
		DatagramPacket packet = new DatagramPacket(data.getBytes(), data.getBytes().length, 
				InetAddress.getLocalHost(), 8888);
		// 四，通过Socket发送数据
		socket.send(packet);
		// 五，关闭资源
		socket.close();
	}

}
