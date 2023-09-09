package final_exam;
import java.util.*;
public class string_substring {
	public static void main(String[] args) {
		Scanner st = new Scanner(System.in);
		String str1 = st.nextLine();
		String arr[] = str1.split(" ");
		int n = arr.length;
		System.out.print(n+" ");
		for(int i=0;i<n;i++) {
			char ch =arr[i].charAt(0);
			System.out.print(ch);
			
			int a = (int)ch;
			System.out.print(a+" ");
		}
				
		
	}
}
