package Day1_conditional_statement;

import java.util.Scanner;

//4. Check if a Year is a Leap Year
public class Leap_Year {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc =new Scanner(System.in);
	       System.out.println("Enter Year: ");
	       int year =sc.nextInt();
	       if(year%400==0) {
	    	   System.out.println("Leap year ");
	       }else if(year%100==0) {
	    	   System.out.println("not Leap Year: ");
	       }
	       else if(year%4==0) {
	    	   System.out.println("leap Year: ");  
	       }else {
	    	   System.out.println("Not leap Year: ");
	       }
	}

}
