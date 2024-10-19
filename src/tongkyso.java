import java.util.Scanner;

public class tongkyso {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// Declare
		int n, kq;

		// Input
		System.out.println("Nhap gia tri n (2 so): ");
		n = scan.nextInt();

		kq = (n / 10) + (n % 10);

		// Output
		System.out.println("Tong gia tri 2 ky so: " + kq);
	}
}
