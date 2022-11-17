package com.Quetion2.java;

//Author is Kunal
//Code to display Calculator
import java.util.Scanner;

public class Calculator {

		public static void main(String[] args) {
			int x,y;
			int choice;
			int Add,Substract,Multiply,Div;
			
			System.out.println("Enter your choice");
			//choose which operation user have to perform
			System.out.println("1 Add");
			System.out.println("2 Substract");
			System.out.println("3 Multiply");
			System.out.println("4 Div");
			
					Scanner sc=new Scanner(System.in);
					choice=sc.nextInt();
			System.out.println("Enter your first numbers:");
			x=sc.nextInt();
			System.out.println("Enter your second numbers:");
			y=sc.nextInt();
			
			switch(choice)
			{
			case 1:
				Add=x+y;
				System.out.println("Addition of numbers is "+Add);
				break;
			case 2:
				Substract=x-y;
				System.out.println("Substraction of numbers is "+Substract);
				break;
			case 3:
				Multiply=x*y;
				System.out.println("Multiplication of numbers is "+Multiply);
				break;
			case 4:
				Div=x/y;
				System.out.println("Division of numbers is "+Div);
				break;
			default:
			
				System.out.println("Please enter correct choice");
				break;
				
			}
		}		
				
		
}

