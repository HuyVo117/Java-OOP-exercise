package oop_1_4;

public class main {
public static void main(String[] args) {
	Employee e1 = new Employee(8, "Peter", "Tan", 2500);
	System.out.println(e1);
	e1.setSalary(999);
	System.out.println(e1.getAnnualSalary());
	System.out.println(e1.getSalary());
	System.out.println(e1.raiseSalary(100));
	System.out.println(e1.toString());
	
	
}
}