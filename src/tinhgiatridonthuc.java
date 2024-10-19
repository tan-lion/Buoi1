import java.util.Scanner;

public class tinhgiatridonthuc {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// Declare
		float a, kq, x = 8;
		int n;
		// Input
		System.out.println("Nhap gia tri a: ");
		a = scan.nextFloat();
		System.out.println("Nhap gia tri n: ");
		n = scan.nextInt();

		kq = (float) (a * Math.pow(x, n));

		// Output
		System.out.println("Gia tri don thuc: " + kq);
	}
}
