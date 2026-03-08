package Day1_conditional_statement;

import java.util.Scanner;

// Check if a Number is Positive, Negative, or Zero

public class Positive_Negative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a Numbers: ");
		int a= sc.nextInt();
		if(a>0) {
			System.out.println("Number is positive");
		}
		else if(a<0) {
			System.out.println("Number is Negative");
		}
		else if(a==0) {
			System.out.println("Number is zero");
			
		}

	}

}
