package oop_1_1;

public class Circle {
private double radius =1.0;
private String color ="red";
public Circle(double radius, String color) {
	this.radius = radius;
	this.color = color;
}
public double getRadius() {
	return radius;
}
public void setRadius(double radius) {
	this.radius = radius;
}
public String getColor() {
	return "red";
}
public void setColor(String color) {
	this.color = color;
}
public double getArea() {
	return Math.PI*this.radius*this.radius;
}
@Override
public String toString() {
	return "bai1_1 [radius=" + radius + ", color=" + color + "]";
}

}
