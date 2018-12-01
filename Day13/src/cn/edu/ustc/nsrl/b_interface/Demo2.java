package cn.edu.ustc.nsrl.b_interface;

interface Eraser {
	int length = 8;
	public void clear();
}

class Pencil implements Eraser {
	@Override
	public void clear() {
		// TODO Auto-generated method stub
		System.out.println("这个橡皮是用来啃的");
	}
	public void write() {
		System.out.println("铅笔画画");
	}
}


public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pencil p = new Pencil();
		p.clear();
		p.write();
	}

}
