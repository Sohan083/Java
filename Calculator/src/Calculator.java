import java.util.Scanner;
import java.io.*;
public class Calculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Maths m=new Maths();
		double a,b;
		double ans=0;
		char oper;
		boolean check=true;
		boolean c=true;
		while(check)
		{
			c=true;
			System.out.println("Input your operation:");
			oper=sc.next().charAt(0);
			System.out.println("Input two numbers:");
			a=sc.nextDouble();
			b=sc.nextDouble();
			switch(oper)
			{
			case '+':ans=m.add(a,b);
			         break;
			case '-':ans=m.subtract(a, b);
			         break;
			case '*':ans=m.multiplication(a, b);
			         break;
			case '/':ans=m.division(a, b);
			         break;
			case '^':ans=m.power(a, b);
			         break;
			default :c=false;
			}
			if(c)
			System.out.println("Your answer: "+ans+"\n");
			else System.out.println("Unvalid operator!");
		}
	}
}
