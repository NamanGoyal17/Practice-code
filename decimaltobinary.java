package st1;
import java.util.*;
public class decimaltobinary {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int rem;
		int i=1;
		int ans=0;
		while(n!=0) {
			rem=n%2;
			ans = ans+rem*i;
			i=i*10;
			n=n/2;
		}
		System.out.print(ans);
	}

}
