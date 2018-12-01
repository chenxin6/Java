class Student {
	String name;
	int id;
	int age;
	
	public void study() {
		System.out.println("学好开发要敲代码");
	}
}

public class Day09_1 {
	public static void main(String[] args) {
		Student stu = new Student();
		
		stu.name = "匿名君";
		stu.id = 3;
		stu.age = 16;
		
		stu.study();
		
		new Student().study();
		/*
		new Student().name = "zzz";
		System.out.println(new Student().name);
		这里通过打印可以发现，不能在打印方法中获取name属性
		原因：前后是两个通过new创建的对象是完全不同的对象
		所以成员变量的值也会不相同
		*/
	}
}