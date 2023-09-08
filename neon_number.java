package final_exam;
import java.util.*;
public class neon_number {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int dou = n*n;
		int rem=0;
		int sum=0;
		while(dou!=0) {
			rem = dou%10;
			sum = rem+sum;
			dou = dou/10;
		}
		if(sum == n) System.out.print("yes");
		else System.out.println("no");
	}
}
