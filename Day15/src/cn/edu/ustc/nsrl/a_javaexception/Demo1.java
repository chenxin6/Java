package cn.edu.ustc.nsrl.a_javaexception;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Throwable t = new Throwable();
		Throwable t = new Throwable("老子今天身体不舒服");
		System.out.println(t.getMessage());
		System.out.println(t.toString());
		//t.printStackTrace();
		
		testThrowable();
	}
	
	public static void testThrowable() {
		Throwable t = new Throwable("这里有问题");
		t.printStackTrace();
	}
}
