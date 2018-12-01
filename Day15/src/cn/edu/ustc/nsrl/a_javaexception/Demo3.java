package cn.edu.ustc.nsrl.a_javaexception;

public class Demo3 {
	
	public static void main(String[] args) {
		test(1, 0, null);
	}
	
	public static void test(int num1, int num2, int[] arr) {
		//int ret = num1 / num2;
		int ret = 0;
		
		//System.out.println(num1 / num2);
		try {
			ret = num1 / num2;
			arr[0] = 5;
		} catch (ArithmeticException e) { //算术异常
			// TODO: handle exception
			e.printStackTrace();
		} catch (NullPointerException e) {
			e.printStackTrace();
		} catch (Exception e) { //除了上面两个的异常，其他的最终的处理方式
			
		}
		System.out.println(ret);
		System.out.println("这条代码会运行"); //如果没有try-catch则不会运行
	}
}
