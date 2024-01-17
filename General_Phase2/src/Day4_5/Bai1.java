package Day4_5;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Bai1 {

	public static void main(String[] args) {
		/*
		 * Viết chương trình Java bằng cách sử dụng vòng lặp for để in mẫu sau "*
		 **
		 ***
		 ****
		 *****
		 */
		int row, col, n;
		Scanner input = new Scanner(System.in);
		System.out.println("Nhập n:");
		n = input.nextInt();

		for (row = 1; row <= n; row++) {
			for (col = 1; col <= row; col++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
	}

}
