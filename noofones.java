package st1;
import java.util.*;
public class noofones {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int i=1;
		int rem;
		int ans=0;
		while(n!=0) {
			rem = n%2;
			ans = ans+rem*i;
			i = i*10;
			n = n/2;
		}
		int res;
		int count=0;
		while(ans!=0) {
			res=ans%10;
			if(res==1) {
				count++;
			}
			ans = ans /10;
		}
		System.out.print(count);
		
	}
}
