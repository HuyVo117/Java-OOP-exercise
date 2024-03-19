package oop_1_2;

public class main {
public static void main(String[] args) {
	Circle c1 = new Circle(1.1);
	System.out.println(c1);
	Circle c2= new Circle();
	System.out.println(c2);
	
	c1.setRadius(2.2);
	System.out.println(c1);
	System.out.println("radius is "+c1.getRadius());
	System.out.println("Area is "+c1.getArea());
	System.out.println("Chu vi is "+c1.getCircumference());
}
}
