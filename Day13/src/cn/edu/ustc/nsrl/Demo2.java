package cn.edu.ustc.nsrl;

abstract class Shape {
	abstract public float perimeter();
	abstract public float square();
}

class MyCircle extends Shape {

	private float r;
	private float pi = 3.1415926f;
	
	public MyCircle() {}
	public MyCircle(float r) {
		if (r <= 0) {
			this.r = 1;
		} else {
			this.r = r;
		}
	}
	
	public float getR() {
		return r;
	}
	public void setR(float r) {
		this.r = r;
	}
	@Override
	public float perimeter() {
		// TODO Auto-generated method stub
		return 2 * r * pi;
	}
	@Override
	public float square() {
		// TODO Auto-generated method stub
		return r * r * pi;
	}
}

class Rect extends Shape {
	private float length;
	private float width;
	
	public Rect() {}
	public Rect(float length, float width) {
		this.length = length;
		this.width = width;
	}
	
	public float getLength() {
		return length;
	}
	public void setLength(float length) {
		this.length = length;
	}
	public float getWidth() {
		return width;
	}
	public void setWidth(float width) {
		this.width = width;
	}
	@Override
	public float perimeter() {
		// TODO Auto-generated method stub
		return 2 * (length + width);
	}
	@Override
	public float square() {
		// TODO Auto-generated method stub
		return length * width;
	}
}

class Triangle extends Shape {
	float l1;
	float l2;
	float l3;
	
	public Triangle() {}
	public Triangle(float l1, float l2, float l3) {
		if (l1 < (l2 + l3) && l2 < (l1 + l3) && l3 < (l1 + l2)) {
			this.l1 = l1;
			this.l2 = l2;
			this.l3 = l3;
		} else {
			throw new RuntimeException("错了！！！");
		}
	}
	
	@Override
	public float perimeter() {
		return l1 + l2 + l3;
	}
	@Override
	public float square() {
		float p = (l1 + l2 + l3) / 2;	
		return (float) Math.sqrt(p * (p - l1) * (p - l2) * (p - l3));
	}
}

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
