package final_exam;
import java.util.*;
public class stringsplit {

	public static void main(String[] args) {
		Scanner st = new Scanner (System.in);
		String str1 = st.nextLine();
		char arr[] = str1.toCharArray();
		for(int i =arr.length-1;i>=0;i--) {
			System.out.print(arr[i]);
		}
		

	}

}
