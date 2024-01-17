package Day4_5;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Bai2 {

	public static void main(String[] args) {
		/*
		 * Viết chương trình tính : S=1+1/2+1/3+....+1/n Số n được nhập từ bàn phím
		 * 
		 */
		int n = 0;
		float S = 0;
		// làm tròn đến 2 chữ số thập phân
		DecimalFormat decimalFormat = new DecimalFormat("#.##");
		System.out.print("Mời nhập n: ");
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		for (int i = 1; i <= n; i++) {
			S = S + (float) 1 / i;
		}
		System.out.println("Kết quả S = " + decimalFormat.format(S));

	
	}

}
