/**
 * @author sunshine
 * @date 2016.12.02 14:33
 * @purpose 9 * 9 乘法表  
 */
package chapter6circulation;

public class MultiplicationTabel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int MULTIPLICATION_TABEL_SIZE = 9;
		
		for (int i = 1; i <= MULTIPLICATION_TABEL_SIZE; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(j + " * " + i + " = " + j * i + "\t");
			}
			System.out.println();
		}
	}

}
