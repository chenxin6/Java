class Car {
	String name;
	String color;
	int wheel;
	
	public void run() {
		if (4 == wheel) {
			System.out.println("我开着" + name + "飞奔");
		} else {
			System.out.println("快去修理厂");
		}
	}
}

class Factory {
	String name;
	String address;
	String telephone;
	
	public void repair(Car che) throws InterruptedException {
		if (che.wheel < 4) {
			System.out.println("修理中");
			Thread.sleep(1000); //程序暂停1s
			che.wheel = 4;
			System.out.println("给钱");
		} else {
			System.out.println("车没有问题");
		}
	}
}

public class Day09 {
	public static void main(String[] args) throws InterruptedException {
		Car mbh = new Car();
		mbh.name = "迈巴赫";
		mbh.color = "黑色";
		mbh.wheel = 4;
		mbh.run();
		System.out.println("车胎爆炸");
		mbh.wheel = 3;
		mbh.run();
		
		Factory xiaoliu = new Factory();
		xiaoliu.name = "小刘补胎";
		xiaoliu.address = "唐宁街10号对面";
		xiaoliu.telephone = "8888";
		
		xiaoliu.repair(mbh);
		mbh.run();
	}
}