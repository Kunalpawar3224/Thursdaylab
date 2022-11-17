package com.Quetion2.java;


import java.util.Scanner;

public class Calculator {

		public static void main(String[] args) {
			int a,b;
			int choice;
			int Add,Substract,Multiply,Div;
			
			System.out.println("Enter your choice");
			//choose which operation user have to perform
			System.out.println("1.Addition");
			System.out.println("2.Substraction");
			System.out.println("3.Multiplication");
			System.out.println("4.Division");
			//Input for the user taken through scanner
					Scanner sc=new Scanner(System.in);
					choice=sc.nextInt();
			System.out.println("Enter first numbers:");
			a=sc.nextInt();
			System.out.println("Enter second numbers:");
			b=sc.nextInt();
			
			switch(choice)
			{
			case 1:
				Add=a+b;
				System.out.println("Addition of number is :"+Add);
				break;
			case 2:
				Substract=a-b;
				System.out.println("Substraction of number is :"+Substract);
				break;
			case 3:
				Multiply=a*b;
				System.out.println("Multiplication of number is :"+Multiply);
				break;
			case 4:
				Div=a/b;
				System.out.println("Division of number is :"+Div);
				break;
			default:
			
				System.out.println("you have enetred a wrong choice,Enter correct choice");
				break;
				
			}
		}		
				
		
}

