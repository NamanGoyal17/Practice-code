package st1;
import java.util.*;
public class union {
	public static void main(String[] args) {
		HashSet<Integer> mp = new HashSet<Integer>();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		int arr[] = new int[n];
		int brr[] = new int[k];
		for(int i =0;i<n;i++) {
			arr[i] = scan.nextInt();
			mp.add(arr[i]);
		}
		for(int i =0;i<k;i++) {
			brr[i] = scan.nextInt();
			mp.add(brr[i]);
		}
		System.out.print(mp.size());
		
	}
}
	