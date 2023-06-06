package Control_Statements;

import java.util.Scanner;

public class Nested_If_Statement {
	public static void main(String [] args) {
	int age;
	int weight;
	Scanner Scan= new Scanner(System.in);
	age = Scan.nextInt();
	weight = Scan.nextInt();
	System.out.println("enter the age :" +age);
	System.out.println("enter the weight:"+ weight);
	if (age >= 18) {
		if (weight >= 65) {
			System.out.println("Candidate is Eligible");
		}
	}	
	
	int agee;
	int weightt;
	agee = Scan.nextInt();
	weightt = Scan.nextInt();
	
    if (agee  >=18) {
    	if(weightt >=65) {
    		System.out.println("Candiate is Eligible");
    	}else {
    		System.out.println("Candiate is not Eligible for blood donation");
    	}
    }else {
		System.out.println("Age must be greater then or equal to 18 ");
	}

}
}
