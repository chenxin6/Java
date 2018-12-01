package cn.edu.ustc.nsrl.c_duotai;

class Animal {
	int age;
	
	Animal() {}
	Animal(int age) {
		this.age = age;
	}
	
	public void eat(Animal a) {
		System.out.println(a.getClass() + "在吃东西");
	}
	public Animal tellMyWhoAreYou(Animal a) {
		System.out.println(a.getClass());
		return a;
	}
	
}

class Monkey extends Animal {
	public void eat(Monkey m) {
		System.out.println(m.getClass() + "在吃东西");
	}
}

class Tiger extends Animal {
	public void eat(Tiger t) {
		System.out.println(t.getClass() + "在吃东西");
	}
	
}

class Snake extends Animal {
	public void eat(Snake s) {
		//getClass()�������
		System.out.println(s.getClass() + "在吃东西");
	}
}

public class Demo1 {

	public static void main(String[] args) {
		Monkey m = new Monkey();
		m.eat(m);
		
		Tiger t = new Tiger();
		t.eat(t);
		
		Snake s = new Snake();
		s.eat(s);
		
		Animal a = new Animal();
		a.eat(m);
		a.eat(t);
		a.eat(s);
		
		Monkey ma = (Monkey) a.tellMyWhoAreYou(m);
		System.out.println(ma);
		Snake sa = (Snake) a.tellMyWhoAreYou(s);
		System.out.println(sa);
		Tiger ta = (Tiger) a.tellMyWhoAreYou(t);
		System.out.println(ta);
	}

}
