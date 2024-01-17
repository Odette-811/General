package Day4_5;

import java.util.Scanner;

public class Bai8 {
	/*
	 * 8.Viết chương trình thực hiện các công việc như sau : 
	 * a.Nhập một mảng a gồm n
	 * phần tử kiểu nguyên int 
	 * b.Tính tổng số dương lẻ của mảng a 
	 * c.Nhập vào phần tử k, tìm xem k có xuất hiện trong mảng a không. Nếu có chỉ ra các vị trí của k trong mảng. 
	 * d.Sắp sếp mảng a theo thứ tự tăng dần. 
	 * e. Chèn một số p vào mảng a sao cho mảng a vẫn đảm bảo tăng dần.
	 */
	
	
	//c.Nhập vào phần tử k, tìm xem k có xuất hiện trong mảng a không. Nếu có chỉ ra các vị trí của k trong mảng. 
	public static int binarySearch(int arr[], int left, int right, int x) {
		if (right >= left) {
			int middle = left + (right - 1) / 2;// Tương đương (l+r)/2 nhưng ưu điểm tránh tràn số khi l,r lớn
			if (arr[middle] == x)
				return middle;

			if (arr[middle] > x)
				return binarySearch(arr, left, middle - 1, x);

			return binarySearch(arr, middle + 1, right, x);
		}
		return -1;
	}

	
	//d. Sắp xếp 
	
	public static void main(String[] args) {

		// Nhập số lượng phần tử trong mảng từ người dùng
		Scanner input = new Scanner(System.in);
		System.out.print("Nhập số lượng phần tử trong mảng: ");
		int n = input.nextInt();

		// Tạo một mảng các số nguyên với kích thước đã nhập
		int[] A = new int[n];

		// Nhập giá trị từ bàn phím cho mảng A
		System.out.println("Nhập giá trị cho các phần tử trong mảng:");
		for (int i = 0; i < n; i++) {
			System.out.print("Nhập giá trị cho phần tử thứ " + i + ": ");
			A[i] = input.nextInt();
		}
		
		System.out.println("Nhập x:");
		int x = input.nextInt();

		int result = binarySearch(A, 0, n - 1, x);
		if (result == -1) {
			System.out.printf("%d xuất hiện tại chỉ số %d", x, result);
		} else {
			System.out.printf("%d xuất hiện tại chỉ số %d", x, result);
		}		

	}

}
