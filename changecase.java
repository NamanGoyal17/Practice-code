package st2;

import java.util.Scanner;

public class changecase {
	public static void main(String[] args) {
		Scanner st = new Scanner(System.in);
		String str = st.nextLine();
		char arr[] = str.toCharArray();
		for(int i=0;i<arr.length;i++) {
			char ch = arr[i];
			if(ch>='a' && ch<='z') {
				int as =(int) ch;
				as = as-32;
				char ans = (char)as;
				System.out.print(ans);
			}
			else if(ch>='A' && ch<='Z') {
				int as = (int) ch;
				as = as+32;
				char ans = (char) as;
				System.out.print(ans);
			}
			else {
				System.out.print(ch);
			}
		}
	}
}
