package test;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	    System.out.println("Enter a number");
	    int n = s.nextInt();
	    int sum=0;
	    int temp=n;
        while(n>0)
        {
        	int rem=n%10;
        	sum=sum*10+rem;
        	n=n/10;
        }
        if(sum==temp)
        {
        	System.out.println("palind");
        }
        else
        {
        	System.out.println("not palind");
        }
	}

}
