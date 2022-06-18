package com.qa;

public class Rectangle extends Shape {
	
	private int height;
	private int width;
	boolean isSqaure = false;
	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	

	Rectangle(String name, String color, double x, double y, int height, int width) {
		super(name, color, x, y);
		this.height = height;
		this.width = width;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Rectangle [height=" + height + ", width=" + width + "]";
	}
	
	public void isSquare() {
		if (this.getHeight() == this.getWidth()) {
			isSqaure =false;
			System.out.println("This is square");
			int area = this.getHeight()*this.getWidth();	
			System.out.println(area);
		}else {
			System.out.println("this is not a square");
		}
		
	}
	

}
