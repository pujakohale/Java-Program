package Day1_conditional_statement;
/*count Number of Even and Odd digits in a Number
Input: 23456
Output : 3 even  2 odd*/

import java.util.Scanner;

public class count_even_odd_number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
         int num=sc.nextInt();
         int even=0;
         int odd=0;
         while(num>0) {
        	 int rem=num%10;
        	 if(rem%2==0) {
        
        		 even++;
        	 }else {
        		
        		 odd++;
        	 }
        	 num=num/10;
         }

 		System.out.println("Even digits: " + even);
 		System.out.println("Odd digits: " + odd);


	}

}
