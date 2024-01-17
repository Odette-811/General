package Day4_5;

import java.util.Scanner;
import java.util.Stack;

public class Bai6 {

	public static void main(String[] args) {
		/*
		 * 6.Viết chương nhập vào một số nguyên dương n. Sau đó quy đổi n ra hệ nhị
		 * phân.
		 */
		Scanner in = new Scanner(System.in);
        Stack<Integer> stack = new Stack<Integer>();
        System.out.println("Nhập vào số thập phân: ");
        int num = in.nextInt();
        while (num != 0)
        {
            int d = num % 2;
            stack.push(d);
            num /= 2;
        }
        System.out.print("\nGiá trị nhị phân là: ");
        while (!(stack.isEmpty() ))
        {
            System.out.print(stack.pop());
        }

	}

}
