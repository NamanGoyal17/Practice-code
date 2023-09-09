package final_exam;
import java.util.*;
public class remove_from_array {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		ArrayList<Integer> lis = new ArrayList<>();
		for(int i =0;i<n;i++) {
			int ele = scan.nextInt();
			lis.add(ele);
		}
		int tar = scan.nextInt();
        // loop nahi lagega...
		lis.removeIf(i->i==tar);
		for(int i =0;i<lis.size();i++) {
			System.out.print(lis.get(i)+" ");
		}
	}
}
