package Day1_conditional_statement;

import java.util.Scanner;

//Check if a Number is Even or Odd
public class Even_odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc =new Scanner(System.in);
      System.out.println("Enter a Number: ");
      int a=sc.nextInt();
      if(a%2==0) {
    	  System.out.println("Number is even");
      }
      else {
    	  System.out.println("Number is odd");
      }
	}

}
