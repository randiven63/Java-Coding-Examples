package tnsif.c2tc.m07;

import java.util.Scanner;

public class Number {

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);  
	    System.out.println("Enter a number :  ");  
	    int n=sc.nextInt();
	    double squareroot=Math.sqrt(n);
	    System.out.println("The square root of "+ n +" is: "+squareroot);  
	    if (isPrime(n)) 
	    {  
	           System.out.println(n + " is a prime number");  
	    } 
	    else 
	    {  
	           System.out.println(n + " is not a prime number");  
	    }  
	}

	public static boolean isPrime(int n) 
	{
		 if (n <= 1)
		 {
			 return false;
		 }
		 for (int i = 2; i <= Math.sqrt(n); i++) 
		 {  
	           if (n % i == 0) 
	           {  
	               return true;  
	           } 
		 }
		 //System.out.println("");
		 return false;
	}
}

