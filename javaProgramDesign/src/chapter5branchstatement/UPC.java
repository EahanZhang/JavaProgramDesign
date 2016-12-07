package chapter5branchstatement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UPC {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		final long MAX_POSSIBLE_UPC_CODE = 999999999999L;		//UPC码为12位，最大不能超过该值
		
		BufferedReader bufferedReader =							//输入流 
				new BufferedReader(new InputStreamReader(System.in));
		//获得UPC码
		System.out.println("Please enter the UPC code:");
		String upc = bufferedReader.readLine();
		long number = Long.parseLong(upc);
		
		//判断是否为UPC码
		if (number < 0 || number > MAX_POSSIBLE_UPC_CODE) {
			System.out.println("The number you entered is not a correct UPC code");
		} else {
			//将number分解为
			int[] num = new int[12];
			for (int i = 11; i >= 0; i--) {
				num[i] = (int) (number % 10);
				number /= 10;
			}
			
			int m = 0, n = 0, r = 0;
			for (int i = 0; i < 11; i++) {
				if (i % 2 == 0) {
					n += num[i];
				} else {
					m += num[i];
				}
			}
			
			//计算r 的值
			r = 10 - ((m + 3 * n) % 10);
			if (r == num[11]) {
				System.out.println("This is a correct UPC number.");
			} else {
				System.out.println("The number you entered is not a correct UPC code");
			}
		}
	}

}
