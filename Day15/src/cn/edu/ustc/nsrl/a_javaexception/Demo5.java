package cn.edu.ustc.nsrl.a_javaexception;

//自定义异常
class NotGirlFriendException extends Exception {
	private static final long serialVersionUID = 1L;	
	
	public NotGirlFriendException() {}
	public NotGirlFriendException(String message) {
		super(message);
	}
}

public class Demo5 {

	public static void main(String[] args) 
		throws NotGirlFriendException{
		try {
			buyOneFreeOne(true);			
		} catch (NotGirlFriendException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		buyOneFreeOne(true);
	}
	
	public static void buyOneFreeOne(boolean isLonely) 
		throws NotGirlFriendException{
		if (isLonely) {
			throw new NotGirlFriendException("不用了谢谢，没有");
		}
		System.out.println("买一送一");
	}
}
