package Day2_Array;

public class Even_odd_array {
/*Print Even and Odd numbers  from array.
a={1,2,3,4,5,6}
Even= 3
Odd=3
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {1,2,3,4,5,6};
System.out.println("Even number in an array: ");
for(int i=0;i<a.length;i++) {
	if(a[i]%2==0)
		System.out.println(a[i]);
		
}
System.out.println("Odd number in an array: ");
for(int i=0;i<a.length;i++) {
	if(a[i]%2!=0)
		System.out.println(a[i]);
}
	}

}
