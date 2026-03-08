package Day1_conditional_statement;

import java.util.Scanner;

public class Sum_of_digit_number {
// Find sum of digits in a number

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
         int num=sc.nextInt();
         int sum=0;
         while(num>0) {
        	 sum=sum+num%10;
        	 num=num/10;
         }
System.out.println("Sum of digit in a number: "+sum);
	}

}
