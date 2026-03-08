package Day1_conditional_statement;

import java.util.Scanner;
//Count Number of Digits in a Number (looping)

public class count_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
         int num=sc.nextInt();
int count=0;
while(num>0) {
	num=num/10;
	count++;
}
System.out.println("Number of count is: "+count);
	}

}
