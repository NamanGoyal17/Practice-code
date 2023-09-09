package st1;
import java.util.*;
public class threesum {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int n = scan.nextInt();
		int arr[] = new int[n];
		for(int i =0;i<n;i++){
			arr[i] = scan.nextInt();
		}
		int count =0;
		for(int i=0;i<n-2;i++) {
			for(int j=0;j<n-1;j++) {
				for(int k =0;k<n;k++) {
					if(arr[i]+arr[j]+arr[k]==0) {
						count++;
					}
				}
			}
		}
		if(count>0) System.out.print(1);
		else System.out.print(0);
	}
}
