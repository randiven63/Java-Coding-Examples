package tnsif.c2tc.m07;

import java.util.*;

public class FactorNumber {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int number=sc.nextInt();
			
		System.out.println("Factors of " + number + " are : ");
		for (int i = 3; i <= Math.sqrt(number); i++)
		{
			 // check if remainder of division is 0
			 if (number % i == 0) 
			 {
				 System.out.print(i +  "\n" + number / i + "\n");
			 }
			 
		}
	}

}
