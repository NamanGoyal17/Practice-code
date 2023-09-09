package st1;
import java.util.*;
public class bigon3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		int z = scan.nextInt();
		if(x>=y && x>=z) System.out.print(x+" is the largest");
		else if(y>=z && y>=x) System.out.print(y);
		else System.out.print(z);
//		int arr[] = new int [3];
//		arr[0]=x;
//		arr[1]=y;
//		arr[2]=z;
//		Arrays.sort(arr);
//		System.out.println(arr[1]);
		
	}
}
