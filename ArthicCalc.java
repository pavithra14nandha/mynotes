package arithamatic;
import java.util.Scanner;
public class ArthicCalc {
	
	public static void main(String[] args) 
	{
		int a;
		 int b;
		float t =9.8f;
		double d=t;
		char e= 'f';
		int k=e;
		
		System.out.println("value of double is" +d);
		System.out.println("ASCII value of char e is  "+k);
		System.out.println("ADDITION of char and int "+(k+d));
		
		Scanner sc= new Scanner(System.in);
		while(true)
		{
			System.out.println("enter number any two numbers");
			a=sc.nextInt();
			b=sc.nextInt();
			
			System.out.println("enter any operator + - * /  % ");
			String operator = sc.next();
			char c = operator.charAt(0);
			if(c== '+')
				System.out.println("addition is "+(a+b));
			else if(c == '-')
				System.out.println("subtraction is "+(a-b));
			else if(c == '*')
				System.out.println("multiplication is "+(a*b));
			else if(c == '/')
				System.out.println("division is  "+(a/b));
			else if(c=='%')
				System.out.println("modulo is "+(a%b));
			else
				System.out.println("select the proper operand");
			System.out.println("enter yes to continue and ok to exit");
			String input= sc.next().intern();
			if(input == "yes"|| input == "yes")
				continue;
			else
				break;
			
		
		}
	
		
		
	}

}
