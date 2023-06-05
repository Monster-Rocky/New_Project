package Control_Statements;

import java.util.Scanner;

public class If_Statement {
	public static void main(String [] args) {
		int a =10;
		int b =12;
		int c= a+b;
		if (c>20){
		System.out.println("c is greater then 20");	
		}
		
		Scanner abc =new Scanner(System.in);
		int x;
		int y; 
		x = abc.nextInt();
		System.out.println("Enter the 1st Number :" +x);
		y = abc.nextInt();
		System.out.println("Enter the 2nd Number :" +y);
		int z = x+y;
		if (z<20) {
			System.out.println("z is less then 20");
			
		}
	}

}
