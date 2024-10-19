import java.util.Scanner;

public class doCsangdoF {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// Declare
		int c;
		float f;

		// Input
		System.out.println("Nhap gia tri do C: ");
		c = scan.nextInt();

		f = (float) (c * 1.8 + 32);
		
		//Output
		System.out.println("Gia tri do F: " + f);
	}
}
