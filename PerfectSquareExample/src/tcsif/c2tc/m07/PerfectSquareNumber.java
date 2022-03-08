package tcsif.c2tc.m07;

import java.util.Scanner;

public class PerfectSquareNumber {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);  
	    System.out.println("Enter a number :  ");  
	    int n=sc.nextInt();
	    
	    if (isPerfectSquare(n))
            System.out.println("Yes");
        else
            System.out.println("No");	 
	}
    static boolean isPerfectSquare(int n)
    {
        for (int i = 1; i * i <= n; i++)
        {
        	if ((n % i == 0) && (n / i == i)) 
            {
                return true;
            }
        }
        return false;
    }


}
