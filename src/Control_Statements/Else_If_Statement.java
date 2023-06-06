package Control_Statements;

import java.util.Scanner;

public class Else_If_Statement {
	public static void main(String[] args)
	{
		int Marks;
		Scanner n = new Scanner(System.in);
		Marks= n.nextInt();
		System.out.println("Enter the Marks:"+Marks);
		if (Marks<35) {
			System.out.println("fail");
		}else if(Marks<=45) {
			System.out.println("pass");
		}else if (Marks<60) {
			System.out.println("Second Class");
		}else if (Marks<75) {
			System.out.println("Frist Class");
		}else if(Marks<90){
			System.out.println("Distinction ");
		}else {
			System.out.println("Grade A");
		}
	
	String City ="Pune";
	if (City == "Pune") {
		System.out.println("Enter Pune");
	}else if (City == "Solapur") {
		System.out.println("Enter Solapur");
	}else if (City == "Pandharpur") {
		System.out.println("Pandharpur");
	}else {
		System.out.println("Enter Mumbai");
}

}
}
