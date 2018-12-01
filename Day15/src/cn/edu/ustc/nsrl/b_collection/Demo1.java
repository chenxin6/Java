package cn.edu.ustc.nsrl.b_collection;

import java.util.Arrays;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object[] arr = new Object[5];
		arr[0] = "过年放假通知已经下来了，我不能告诉你们";
		arr[1] = 8;
		arr[2] = 0.5f;
		arr[3] = new Demo1();
		arr[4] = true;
		System.out.println(Arrays.toString(arr));
		
	}

}
