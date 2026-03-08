package Day1_conditional_statement;

import java.util.Scanner;

//3. Find the Largest of Three Numbers
public class Largest_Three_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc =new Scanner(System.in);
       System.out.println("Enter first Number");
       int a =sc.nextInt();
       System.out.println("Enter second number");
       int b=sc.nextInt();
       System.out.println("Enter third number");
       int c =sc.nextInt();
       if(a>b && a>c) {
    	   System.out.println("First number is largest");
       }
       else if(b>a && b>c){
    	   System.out.println("second number is largest");
    	   
       }else {
    	   System.out.println("Third number is largest");
       }
	}

}
