package Day2_Array;

public class Sum_of_array {
	 /*Find Sum of Elements in Array
	 a={1,2,3,4,5}
	 Sum=15*/

	public static void main(String[] args) {
		int a[]= {5,8,7,3,1,5};
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		System.out.println("The sum of element in array is: "+sum);
	}

}
