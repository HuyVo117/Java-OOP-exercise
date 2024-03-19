package oop_2_5;

public class Account {
private int id;
private Customer customer;
private double balance = 0.0;
public Account(int id, Customer customer, double balance) {
	
	this.id = id;
	this.customer = customer;
	this.balance = balance;
}
public Account(int id, Customer customer) {
	
	this.id = id;
	this.customer = customer;
	
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public Customer getCustomer() {
	return customer;
}
public void setCustomer(Customer customer) {
	this.customer = customer;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}
@Override
public String toString() {
	return "Account [id=" + id + ", customer=" + customer + ", balance=" + balance + "]";
}
public Account deposit(double amount) {
	 this.balance+=amount;
	 return this;
}
public Account withdraw(double amount){
    if(amount>this.balance){
        System.out.println("amount withdraw exceeds the current balance!");
    }else{
        this.balance -= amount;
    }
    return this;
}
}
