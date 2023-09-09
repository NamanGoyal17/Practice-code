package st1;
import java.util.*;
public class largestsumofmaxarray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = scan.nextInt();
		}
		int ans = Integer.MIN_VALUE;
		int sum=0;
		for(int i=0;i<n;i++) {
			sum= sum+arr[i];
			ans = Math.max(ans, sum);
			if(sum<0)
			sum = 0;
		}
		
		System.out.print(ans);
		
	}
}
