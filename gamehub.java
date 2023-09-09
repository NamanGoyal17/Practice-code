package st1;
import java.util.*;
public class gamehub {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = scan.nextInt();
		}
		int p1 = scan.nextInt();
		int p2 = scan.nextInt();
		int count =0;
		for(int i =0;i<n;i++) {
			if(p1%arr[i]==0 && p2%arr[i]==0) {
				count++;
			}
		}
		System.out.print(count);

	}

}
