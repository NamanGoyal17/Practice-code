package st1;
import java.util.*;
public class armstrongnumber {
	
	public static int size(int n) {
		int rem;
		int count =0;
		while(n!=0) {
			rem=n%10;
			count++;
			n=n/10;
		}
		return count;
	}
	
	public static void arm(int n) {
		int x = n;
		double ans =0;
		int size = size(n);
		int rem;
		while(n!=0) {
			rem = n%10;
//			sp = rem*rem*rem;
			ans = ans + Math.pow(rem,size);
			n = n/10;
		}
		if (ans == x)System.out.print(x+" ");
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		for(int i=a+1;i<b;i++) {
			arm(i);
		}
	}
}
