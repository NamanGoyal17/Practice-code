import java.util.*;
public class fibonacci_series {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a=0;
		int b=1;
		int next;
		if(n==a || n==b) {
			System.out.println("ha hai ye ");
		}
		else {
			next=a+b;
			while(next<n) {
				a=b;
				b=next;
				next=a+b;
			}
			if(n==next) {
				System.out.println("ha hai ye");
			}
			else {
				System.out.println("nahi hai ye");
			}
		}
	}

}
