package com.epam.gitdemo;
import static org.junit.Assert.*;
import java.util.*;
public class Client {
	public static void main(String args[])
	{
	Calculator object1 = new Calculator();
	SimpleInterest object2 = new SimpleInterest();
	CompoundInterest object3 = new CompoundInterest();
	ConstructionCost object4 = new ConstructionCost();
	int principal,time,rate_of_interest;
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	System.out.print("\n--------------------------Menu------------------------------\n");
	System.out.print("1.Calculator\n");
	System.out.print("2.SimpleInterest\n");
	System.out.print("3.CompoundInterest\n");
	System.out.print("4.ConstructionCost\n\n");
	System.out.print("Choose any option:");
	int choice = sc.nextInt();
	switch(choice)
	{
	case 1:
		System.out.print("\n----------------Calculator--------------------------\n");
		System.out.print("Enter any two numbers:");
		int number1=sc.nextInt();
		int number2=sc.nextInt();
		System.out.print("\nAddition of given two numbers : "+ object1.add(number1, number2));
		System.out.print("\nSubraction of given two numbers : "+ object1.subract(number1, number2));
		System.out.print("\nMultiplication of given two numbers : "+ object1.multiply(number1, number2));
		System.out.print("\nDivision of given two numbers : "+ object1.divide(number1, number2));
		System.out.print("\nModulus of given two numbers : "+ object1.modulus(number1, number2));
		assertEquals(5, object1.add(2,3));
		assertEquals(-1, object1.subract(2,3));
		assertEquals(6, object1.multiply(2,3));
		assertEquals(0, object1.divide(2,3));
		assertEquals(2, object1.modulus(2,3));
		break;
	case 2:
		System.out.print("\n----------------SimpleInterest--------------------------\n");
		System.out.print("Enter Principal amount:");
		principal=sc.nextInt();
		System.out.print("Enter Time period:");
		time=sc.nextInt();
		System.out.print("Enter Rate of Interest:");
		rate_of_interest=sc.nextInt();
		System.out.print("\n\nSimple Interest = "+ object2.calculateSimpleInterest(principal, time, rate_of_interest));
		assertEquals(4.0 , object2.calculateSimpleInterest(100 , 2 , 2),0.0);
		break;
	case 3:
		System.out.print("\n----------------CompoundInterest--------------------------\n");
		System.out.print("Enter Principal amount:");
		principal=sc.nextInt();
		System.out.print("Enter Time period:");
		time=sc.nextInt();
		System.out.print("Enter Rate of Interest:");
		rate_of_interest=sc.nextInt();
		System.out.print("Enter number of times that interest is compounded per year:");
		int number_of_times=sc.nextInt();
		System.out.print("\n\nCompound Interest = "+ object3.calculateCompoundInterest(principal, time, rate_of_interest, number_of_times));
		assertEquals(1600.0 , object3.calculateCompoundInterest(100 , 2 , 2,2),0.0);
		break;
	case 4:
		System.out.print("\n----------------ConstructionCost--------------------------\n");
		System.out.print("Enter area in square feet:");
		int area=sc.nextInt();
		System.out.print("Enter required standards(standard/above standard/high standard/high standard and fully automated): ");
		sc.nextLine();
		String material_standard=sc.nextLine();
		if(object4.claculateConstructionCost(material_standard, area)>=0)
		System.out.print("\n\nConstruction cost = "+ object4.claculateConstructionCost(material_standard, area));
		else
			System.out.print("\n\nInvalid material standard");
		assertEquals(28800.0 , object4.claculateConstructionCost("standard",24),0.0);
		break;
	default:System.out.print("\n-----------------Invalid Option--------------------\n");
	}
	}
}
