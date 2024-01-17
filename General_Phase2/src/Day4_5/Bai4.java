package Day4_5;

import java.util.Scanner;

public class Bai4 {

	public static void main(String[] args) {
		/*
		 * Tính tổng và tích các chữ số của một số m, m được nhập từ bàn phím (Ví dụ : m
		 * = 234 => S = 2 + 3 + 4 = 9, P = 2 * 3 * 4 = 24)
		 */
		int m = 0;
		int S = 0, P = 1;
		Scanner input = new Scanner(System.in);
		System.out.print("Mời nhập m: ");
		m = input.nextInt();
		if (m < 0) {
			do {
				System.out.print("Mời nhập lại m: ");
				m = input.nextInt();
			} while (m < 0);
		}
		do {
			S = S + (m % 10);
			P = P * (m % 10);
			m = m / 10;
		} while (m > 0);

		System.out.println("Tổng các chữ số trong m là: " + S);
		System.out.println("Tích các chữ số trong m là: " + P);

	}

}
