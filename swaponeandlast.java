package st1;
import java.util.*;
public class swaponeandlast {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int arr[][] = new int[n][m];
		for(int i =0;i<n;i++) {
			for(int j =0 ;j<m;j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		for(int i=0;i<n;i++) {
			
			int temp = arr[i][0];
			arr[i][0] = arr[i][m-1];
			arr[i][m-1]=temp;
			
		}
		for(int i =0;i<n;i++) {
			for(int j =0 ;j<m;j++) {
				System.out.print(arr[i][j]+" "); 
			}
			System.out.println();
		}

	}
}
