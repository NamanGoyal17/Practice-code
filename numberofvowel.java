package st2;
import java.util.*;
public class numberofvowel {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		String str = scan.nextLine();
		char arr[] = str.toCharArray();
		int count =0;
		for(int i=0;i<arr.length;i++) {
			char c =arr[i];
//			System.out.println(c);
			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' ||c=='I' || c=='O' || c=='U') {
				count++;
			}
		}
		System.out.print(count);
	}
}
	 