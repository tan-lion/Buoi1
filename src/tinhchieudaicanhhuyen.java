import java.util.Scanner;

public class tinhchieudaicanhhuyen {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// Input
		System.out.println("Nhap gia tri canh doi: ");
		int canhDoi = scan.nextInt();
		System.out.println("Nhap gia tri canh ke: ");
		int canhKe = scan.nextInt();

		float canhHuyen = (float) Math.sqrt(Math.pow(canhDoi, 2) + Math.pow(canhKe, 2));
		
		//Output
		System.out.println("Do dai canh huyen: " + canhHuyen);
	}

}
