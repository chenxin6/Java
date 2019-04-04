package cn.edu.ustc.nsrl.b_javaAPI;

public class Demo1 {

	public static void main(String[] args) {
		String str1 = "David";
		String str2 = new String(str1);
		String str3 = new String(str1);
		String str4 = new String(str1);
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		// 调用无参构造方法，创建一个默认字符个数为16的StringBuffer对象
		StringBuffer str = new StringBuffer();
		str.append("sss");
		str.append("aaa");
		str.insert(3, "bbb");
		System.out.println(str.toString());
		String str5 = str.substring(0, 6);
		System.out.println(str5);
		str.delete(0, 6);
		System.out.println(str.toString());
		str.deleteCharAt(0);
		System.out.println(str.toString());
		str.reverse();
		System.out.println(str.toString());
		// StringBuilder 是线程不安全的，JDK1.5之后的新特征，但是效率高
		// StringBuffer 是线程安全的，效率低
		// 输出如下
//		David
//		David
//		David
//		David
//		sssbbbaaa
//		sssbbb
//		aaa
//		aa
//		aa
	}
	
}
