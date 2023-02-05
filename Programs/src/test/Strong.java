package test;

import java.util.Scanner;

public class Strong {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	    System.out.println("Enter a number");
	    int n =s.nextInt();
	    int sum=0;
	    int temp=n;
        while(n>0)
        { 
        	int rem=n%10;       
        	int fact=1;
        	for(int i=1;i<=rem;i++)
        	{
        	fact=fact*i;	
        	}
        	sum=sum+fact;
        	n=n/10;        
        }
        if(sum==temp)
        System.out.println("strong number");
        else
        System.out.println("not a strong number");
        }
}
