package st1;
import java.util.*;
public class kajukatlipattern {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for(int i =1;i<=n;i++) {
			for(int j =1;j<=n;j++) {
				
				if(j<=n-i) System.out.print(".");
			//}
			//for(int j =1;j<=i;j++) {
				else System.out.print("*");
			}
			System.out.println();
		}
		//for(int i = )
	}
}
