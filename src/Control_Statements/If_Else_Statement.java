package Control_Statements;

import java.util.Scanner;

public class If_Else_Statement {
	public static void main (String [] args) {
		int p=10;
		int q=25;
		int r;
		r= p+q;
		if(r>20) {
			System.out.println("r is greater than 20");	
		}
		else {
			System.out.println("r is less than 20");
		}
		
		Scanner scan = new Scanner(System.in);
		int  x =scan.nextInt();
			int  y =scan.nextInt();
			int z = x+y;
			if(z>20) {
				System.out.println("z is greater than 20");	
			}
			else {
				System.out.println("z is less than 20");
			}
		
	}

}
