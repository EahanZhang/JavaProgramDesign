package chapter8arrayandset;

public class MatrixDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[][] a = {
				{1, 1, 1},
				{1, 1, 1},
				{1, 1, 1}
		};
		
		double[][] b = {
				{1, 2},
				{2, 3},
				{3, 4}
		};
		
		double[][] c = {
				{1, 1, 1},
				{1, 1, 1},
				{1, 1, 1}
		};
		
		Matrix matrix1 = new Matrix(a);
		Matrix matrix2 = new Matrix(b);
		Matrix matrix3 = new Matrix(c);
		Matrix identityMatrix = Matrix.identityMatrix(4);
		
		Matrix addMatrix = matrix1.add(matrix3);
		Matrix multiplyMatrix = matrix1.multiply(matrix2);
		
		System.out.println(addMatrix.toString());
		System.out.println(multiplyMatrix.toString());
		System.out.println(identityMatrix.toString());
	}

}
