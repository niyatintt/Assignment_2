package assignment2;

import java.util.Scanner;

public class Member {
	
	String name;
	int age;
	String phonenumber;
	String address;
	double  salary;
	 Scanner sc=new Scanner(System.in);
	 
	public void printSalary() {
		System.out.println("please enter you salary");
		salary=sc.nextDouble();
		System.out.println("the amount od salary is"+salary);
		
		
		
		}

}
