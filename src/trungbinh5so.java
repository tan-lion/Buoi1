import java.util.Iterator;
import java.util.Scanner;

public class trungbinh5so {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Declare
		int[] a = new int[5];
		float tongTrungBinh = 0;

		// Input
		for (int i = 0; i < a.length; i++) {
			System.out.println("Nhap gia tri thu " + i + ": ");
			a[i] = scan.nextInt();
		}
		for (int i : a) {
			tongTrungBinh += i;
		}
		
		//Output
		System.out.println("Tong trung binh 5 so: " + tongTrungBinh / 5);
	}
}
