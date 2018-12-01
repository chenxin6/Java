package cn.edu.ustc.nsrl;

class Baby {
	private String name;
	private int id;
	
	public Baby() {}
	
	public Baby(String n, int i) {
		name = n;
		id = i;
	}
	
	public Baby(String n) {
		name = n;
	}
	
	public Baby(int i) {
		id = i;
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public String getName() {
		return name;
	}
	
	public void setId(int i) {
		id = i;
	}
	
	public int getId() {
		return id;
	}
	
	public void cry() {
		System.out.println("哇哇大哭");
	}
	
	public void sleep() {
		System.out.println("哭完就睡");
	}
}

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Baby b = new Baby();
		
		b.sleep();
	}

}
