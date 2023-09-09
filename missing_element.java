package st1;
import java.util.*;
public class missing_element {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int arr[] = new int[n];
		for(int i =0;i<n-1;i++) {
			arr[i] = scan.nextInt();
		}
		int ws = n*(n+1)/2;
		int sum =0;
		for(int i =0;i<n-1;i++) {
			sum = sum+arr[i];
		}
		int mis = ws-sum;
		System.out.print(mis);
		
	}
}
