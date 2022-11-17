package com.Quetion2.java;

//Author is Kunal
//Code to display Calculator
import java.util.Scanner;

public class Calculator {

		public static void main(String[] args) {
			int a,b;
			int choice;
			int Add,Substract,Multiply,Div;
			
			System.out.println("Enter your choice");
			//choose which operation user have to perform
			System.out.println("1 Add");
			System.out.println("2 Substract");
			System.out.println("3 Multiply");
			System.out.println("4 Div");
			//Input for the user taken through scanner
					Scanner sc=new Scanner(System.in);
					choice=sc.nextInt();
			System.out.println("Enter your first numbers:");
			a=sc.nextInt();
			System.out.println("Enter your second numbers:");
			b=sc.nextInt();
			
			switch(choice)
			{
			case 1:
				Add=a+b;
				System.out.println("Addition of numbers is "+Add);
				break;
			case 2:
				Substract=a-b;
				System.out.println("Substraction of numbers is "+Substract);
				break;
			case 3:
				Multiply=a*b;
				System.out.println("Multiplication of numbers is "+Multiply);
				break;
			case 4:
				Div=a/b;
				System.out.println("Division of numbers is "+Div);
				break;
			default:
			
				System.out.println("Please enter correct choice");
				break;
				
			}
		}		
				
		
}

