import java.util.Scanner;

public class Duplicate {

	public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter a string"); 
    String str = s.nextLine();
    char[] ch=str.toCharArray();
    for(int i=0;i<ch.length;i++)
    {
    for(int j=i+1;j<ch.length;j++)
    if(ch[i]==ch[j])	
    {
    System.out.println(ch[j]);	
    }
    }
}
}
