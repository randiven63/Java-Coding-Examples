import java.util.Scanner;

public class PalindromeExample {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number : ");
		int n=sc.nextInt();
		int r,sum=0,temp=n;
		while(n>0)
		{    
			   r=n%10;  //getting remainder  
			   sum=(sum*10)+r;    
			   n=n/10;    
		}    
		if(temp==sum)    
			System.out.println("Number is Palindrome");    
		else    
			System.out.println("Number is not Palindrome");
	}

}
