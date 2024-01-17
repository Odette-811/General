package Day4_5;

import java.util.Scanner;

public class Bai7 {

	public static void main(String[] args) {
		// Nhập chuỗi từ bàn phím
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập chuỗi S: ");
		String s = scanner.nextLine();

		// a. In ra chuỗi đảo ngược
		String daoNguoc = daoString(s);
		System.out.println("Chuỗi đảo ngược: " + daoNguoc);

		// b. Đổi toàn bộ kí tự sang chữ Hoa
		String chuHoa = s.toUpperCase();
		System.out.println("Chữ Hoa: " + chuHoa);

		// c. Đổi toàn bộ kí tự sang chữ thường
		String chuThuong = s.toLowerCase();
		System.out.println("Chữ thường: " + chuThuong);

		// d. Bảng tần số xuất hiện của các kí tự
		inTanSo(s);

		// e. Trích ra chuỗi con từ kí tự thứ n đến thứ m
		System.out.print("Nhập chỉ số n: ");
		int n = scanner.nextInt();
		System.out.print("Nhập chỉ số m: ");
		int m = scanner.nextInt();
		String chuoiCon = chuoiCon(s, n, m);
		System.out.println("Chuỗi con: " + chuoiCon);

		scanner.close();
	}

	// Hàm đảo ngược chuỗi
	public static String daoString(String s) {
		StringBuilder stringBuilder = new StringBuilder(s);
		return stringBuilder.reverse().toString();
	}

	// Hàm in ra bảng tần số xuất hiện của các kí tự
	public static void inTanSo(String s) {
		int[] tanSo = new int[256];
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			tanSo[c]++;
		}

		System.out.println("Bảng tần số xuất hiện của các kí tự trong chuỗi: ");
		for (int i = 0; i < 256; i++) {
			if (tanSo[i] > 0) {
				System.out.println((char) i + ": " + tanSo[i]);
			}
		}
	}

	// Hàm trích ra chuỗi con từ kí tự thứ n đến thứ m
	public static String chuoiCon(String s, int n, int m) {
		if (n < 0) {
			n = 0;
		}
		if (m > s.length()) {
			m = s.length();
		}
		return s.substring(n, m);

	}

}
