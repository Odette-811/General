package Day4_5;

public class Bai10 {
	int data = 50;

	void change(int data) {
		data = data + 100;
	}
	
	/**
	 * @author Thuy Hang
	 * @version 1.0
	 * @since 12-01-2023
	 */
	
	//Đây là comments
	
	/* Đây là comments 
	 * Đây là comments
	 * Đây là comments
	 * */
	

	public static void main(String args[]) {
		Bai10 op = new Bai10();
		System.out.println("Trước khi thay đổi: " + op.data);
		op.change(500);
		System.out.println("Sau khi thay đổi: " + op.data);
	}
}