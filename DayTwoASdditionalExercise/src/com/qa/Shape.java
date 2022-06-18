package com.qa;

public abstract class Shape {
	String name;
	String color;
	double x;
	double y;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	Shape(String name,String color, double x, double y){
		this.name =name;
		this.color =color;
		this.x=x;
		this.y=y;
		
		
	}
	public String toString() {
		return color;
		
	}
	public double getArea() {
		return getX()*getY();
		
	}
	public void getCenterPoint() {
		
	}

}
