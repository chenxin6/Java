package cn.edu.ustc.nsrl.a_generticity;

import java.util.Comparator;

/*
 * 在类内使用泛型
 * 格式：
 * 	class 类名<自定义泛型的占位符> {
 * 		//在这里所用到的泛型和用户创建对象时声明的一致
 * 	}
 * 
 * 注意事项：
 * 	一，一个类声明的自定义泛型，如果在创建类对象时，确定了泛型的具体数据类型，
 * 	那么在整个类内所有用到该泛型占位符的非静态成员方法，使用的数据类型都是创
 * 	建时确定的类型
 * 	二，如果创建使用了自定义泛型类对象，但是没有确定泛型的具体类型，那么编译器
 * 	会把这个泛型认为是Object类型
 * 	三，类中声明的自定义泛型，不能在类内的静态方法使用，如果想让静态方法使用泛
 * 	型，则需该静态方法自己声明，自己使用，类似方法中使用泛型
 * 	四，建议：如果在代码中出现了多个使用不同泛型的地方，请使用不同的名字
 * 
 * */

class InvalidArrayException extends Exception {
	public InvalidArrayException(String message) {
		super(message);
	}
}

class InvalidComparatorException extends Exception {
	public InvalidComparatorException(String message) {
		super(message);
	}
}

class ArrayTools<A> {
	public void selectSortUsingCompare(A[] array, Comparator<? super A> com)
			throws InvalidArrayException, InvalidComparatorException {
		//参数合法性判断
		if (null == array || array.length == 0) {
			throw new InvalidArrayException("数组无效");
		} else if (null == com) {
			throw new InvalidComparatorException("比较器无效");
		}
		
		for (int i = 0; i < array.length - 1; i++) {
			int index = i;
			for (int j = i + 1; j < array.length; j++) {
				if (com.compare(array[index], array[j]) > 0) {
					index = j;
				}
			}
			if (index != i) {
				A temp = array[index];
				array[index] = array[i];
				array[i] = temp;
			}
		}
	}

	public void printArray(A[] array) {
		for (A a : array) {
			System.out.println(a);
		}
	}
	
//	虽然上面已经指定了<A>但是这里又要再定义一下因为是静态方法，这里的A可以和上面的A不一样
	public static <A> void test(A a) {
		System.out.println(a);
	}
	
}

public class Demo4 {

	public static void main(String[] args) 
			throws InvalidArrayException, InvalidComparatorException {
		Integer[] array = {1, 3, 5, 7, 9, 2, 4, 6, 8, 10};
		ArrayTools<Integer> tools = new ArrayTools<Integer>();
//		匿名内部类的匿名对象
		tools.selectSortUsingCompare(array, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1 - o2;
			}
		});
		
		tools.printArray(array);
	}

}
