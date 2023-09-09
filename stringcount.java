package st1;
import java.util.*;
public class stringcount {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		char ch = str.charAt(0);
		char arr[] = str.toCharArray();
		int count = 1;
		for(int i =1 ;i<arr.length;i++) {
			if(arr[i]==ch) {
				count++;
			}
			else {
				System.out.print(ch);
				if(count!=1) System.out.print(count);
				ch = arr[i];
				count=1;
			}
		}
		System.out.print(ch);
		System.out.print(count);
	}
}
