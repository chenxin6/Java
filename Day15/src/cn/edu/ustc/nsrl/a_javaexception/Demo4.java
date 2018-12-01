package cn.edu.ustc.nsrl.a_javaexception;

public class Demo4 {

	public static void main(String[] args) 
		throws NullPointerException, ArithmeticException {
		// TODO Auto-generated method stub
		//如果调用一个存在抛出异常的方法，通常有两种处理方法
		//第一种，处理当前异常
//		try {
//			testThrow(null, 1, 2);
//		} catch (NullPointerException e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		} catch (ArithmeticException e) {
//			e.printStackTrace();
//		}
		//第二种，继续往外抛出
		testThrow(null, 1, 2);
	}
	
	public static void testThrow(int[] arr,int num1, int num2) 
		throws NullPointerException, ArithmeticException{
		if (null == arr || arr.length == 0) {
			//古老的处理方案
//			System.out.println("");
//			return;
			throw new NullPointerException("测试一下Throw");
			//System.out.println("111"); //无法执行到的代码
		} else if (0 == num2) {
			throw new ArithmeticException();
		}
		int ret = num1 / num2;
		arr[1] = 0;
		System.out.println(ret);
	}
	
}
