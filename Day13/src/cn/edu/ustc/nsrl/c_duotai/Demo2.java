package cn.edu.ustc.nsrl.c_duotai;

interface USB {
	public void connect();
}

class UPan implements USB {
	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("U盘连接电脑，传输数据");
	}
}

class Keyboard implements USB {
	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("推荐filco键盘，而且是茶轴");
	}
}

class Computer {
	public void USBConnect(USB usb) {
		usb.connect();
	}
}

public class Demo2 {
	public static void main(String[] args) {
		Computer MBP = new Computer();

		MBP.USBConnect(new UPan());
		
		MBP.USBConnect(new Keyboard());
		
	}
}
