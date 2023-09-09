package st1;
import java.util.*;
public class Andrewpipe {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int arr[] = new int[n];
		for(int i =0;i<n;i++) {
			arr[i] = scan.nextInt();
		}
		System.out.print(arr[0]);
		for(int i=1;i<n;i++) {
			if(arr[0]>arr[i]) {
				System.out.print(arr[i]);
			}
		}
	}
}
