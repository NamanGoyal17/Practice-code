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
		lis.removeIf(i->i==tar); //........... IN ARRAYLIST WE CAN ABLE TO USE TO removeIf() FUNCTION TO DELETE A SPECIFIC ELEMENT IN A ARRAY LIST.........
		for(int i =0;i<lis.size();i++) {
			System.out.print(lis.get(i)+" ");
		}
	}
}
