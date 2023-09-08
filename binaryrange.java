package final_exam;
import java.util.*;
public class binaryrange {
	
	public static void convert(long int n) {
		long ans=0;
		int rem;
		int i=1;
		while(n!=0) {
			rem=(int)n%2;
			ans=ans+rem*i;
			i = i*10;
			n=n/2;
		}
		System.out.print(ans+" ");
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		long n = 100000000;
//		for(int i=1;i<=n;i++) {
//			convert(i);
//		}
		convert(n);
	}
}
