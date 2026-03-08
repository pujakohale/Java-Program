package Day1_conditional_statement;

import java.util.Scanner;

public class Palindrome_Number {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a Number: ");
	int act_num=sc.nextInt();
	int org_num=act_num;
	int rev=0;
	while(act_num!=0) {
		rev=rev*10+act_num%10;
		act_num=act_num/10;
	}
	if(org_num==rev) {
		System.out.println("Number is palindrome: " +rev );
	}
	else {
		System.out.println("Number is not palindrome: " +rev);
	}
	}

}
