package st1;
import java.util.*;
public class reverseksubarray {
	
	public static void reverse(int arr[],int k,int i) {
		//int m = arr.length;
		while(k>0) {
			System.out.print(arr[i]+" ");
			i--;
			k--;
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		int arr[] = new int[n];
		for(int i =0;i<n;i++) {
			arr[i] = scan.nextInt();
		}
		int i =k-1;
		while(i<n) {
			reverse(arr,k,i);
			i=i+k;
		}
		i=i-k;
//		System.out.print(i);
		for(int j=n-1;j>i;j--) {
			System.out.print(arr[j]+ " ");
		}
		
	}
}
