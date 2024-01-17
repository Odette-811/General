package Day4_5;

import java.util.Scanner;

public class Bai5 {
	/*
	 * 5.Nhập 2 số nguyên dương a và b.Sau đó in ra ước số chung lớn nhất và bội số
	 * chung nhỏ nhất của 2 số nguyên dương a và b đó.
	 */
	static int UCLN(int a, int b) {
		while (a != b) {
			if (a > b)
				a = a - b;
			else
				b = b - a;
		}
		return a; // or return b; a = b
	}

	static int BCNN(int a, int b) {
		int result = UCLN(a, b);
		return a * b / result;
	}

	public static void main(String[] args) {

		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.print("Mời nhập a: ");
		a = sc.nextInt();
		System.out.print("Mời nhập b: ");
		b = sc.nextInt();
		int result = UCLN(a, b);
		System.out.println("UCLN:" + result);
		result = BCNN(a, b);
		System.out.println("BCNN:" + result);

	}

}
