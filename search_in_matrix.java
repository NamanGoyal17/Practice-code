package st1;
import java.util.*;
public class search_in_matrix {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int arr[][] = new int[n][m];
		for(int i =0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=scan.nextInt();
			}
		}
		int tar = scan.nextInt();
		boolean flag = false;
		for(int i =0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if (arr[i][j]==tar) {
					flag =true;
				}
			}
		}
		if(flag) System.out.print(1);
		else System.out.print(0);
		
	}
}
