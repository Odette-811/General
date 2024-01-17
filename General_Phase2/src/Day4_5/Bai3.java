package Day4_5;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Bai3 {

	public static void main(String[] args) {
		/*
		 * Viết chương trình tính  :
		S = 1+1/3!+1/5!+…..+1/(2n-1)!                        (*)
		Số n được nhập từ bàn phím
		 */
		int n=0;
		float S=0,gt=1;
		// làm tròn đến 2 chữ số thập phân
        DecimalFormat decimalFormat = new DecimalFormat("#.###");
		System.out.print("Mời nhập n: ");
		Scanner input = new Scanner(System.in);
		n=input.nextInt();
		for (int i = 1 ; i <= n*2 ;i++) {
			gt = gt*i;
			if(i % 2 != 0) {
				S = S +(float) 1/gt;
			}
		}
		System.out.println("S = 1+1/3!+1/5!+…..+1/(2n-1)! = "+decimalFormat.format(S));
		
	}
}
