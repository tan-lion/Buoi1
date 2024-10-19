import java.util.Scanner;

public class chuyenUSDsangVND {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// Declare
		double usd, vnd;

		// Input
		System.out.println("Nhap gia tri usd muon doi: ");
		usd = scan.nextFloat();

		vnd = usd * 23500;

		System.out.println("Tong so tien vnd: " + vnd);
	}
}
