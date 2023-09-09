package st1;
import java.util.*;
public class sizeof5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int arr[]= new int [5];
		int brr[] = new int[5];
		for(int i =0;i<5;i++) {
			arr[i]=scan.nextInt();
			brr[i]=arr[i];
		}
		Arrays.sort(brr);
		System.out.println(brr[4]);
		System.out.println(brr[0]);
		int sub =0;
		int sum=0;
		for(int i =1;i<5;i++) {
			sum = sum + arr[i];
		}
		sub = arr[0]-sum;
		System.out.println(sub);
		if(sub>=0) System.out.println("Substration result is equal to or grater than zero");
		else System.out.println("Susbstraction result is less than zero");

	}

}
