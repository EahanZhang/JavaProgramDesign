/**
 *  @author sunshine 2016/12/7 16:56
 */
package chapter8arrayandset;

public class Matrix {
	private double[][] matrix;  //矩阵
	private int columns;  //列数
	private int rows;  //行数
	
	public Matrix() {
		// TODO Auto-generated constructor stub
		matrix = new double[10][10];
		rows = 10;
		columns = 10;
		fill(0);
	}
	
	public Matrix(int m, int n) {
		matrix = new double[m][n];
		rows = m;
		columns = n;
		fill(0);
	}
	
	public Matrix(int m, int n, double v) {
		matrix = new double[m][n];
		rows = m;
		columns = n;
		fill(v);
	}
	
	public Matrix(double[][] a) {
		matrix = a;
		rows = a.length;
		columns = a[0].length;
		
	}
	
	//矩阵加法
	public Matrix add(Matrix a) {
		int m = getNumberRows();
		int n = getNumberColumns();
		
		//判断是否能够相加
		if (m == a.getNumberRows()
				&& n == a.getNumberColumns()) {
			Matrix resultMatrix = new Matrix(m, n);
			for (int i = 0; i < this.getNumberRows(); i++) {
				for (int j = 0; j < this.getNumberColumns(); j++) {
					resultMatrix.matrix[i][j] = 
							this.matrix[i][j] + a.matrix[i][j];
				}
			}
			
			return resultMatrix;
		} else {
			System.err.println("Can not add this matrix");
			return null;
		}
	}
	
	//矩阵乘法
	public Matrix multiply(Matrix a) {
		int m = this.getNumberRows();
		int n = this.getNumberColumns();
		
		if (n == a.getNumberRows()) {
			int p = a.getNumberColumns();
			Matrix resultMatrix = new Matrix(m, p);
			
			int sum = 0;
			for (int i = 0; i < m; i++) {
				for (int k = 0; k < p; k++) {
					for (int j = 0; j < n; j++) {
						sum += this.matrix[i][j] * a.matrix[j][k];
					}
					resultMatrix.matrix[i][k] = sum;
					sum = 0;
				}
			}
			return resultMatrix;
		} else {
			System.err.println("Can not multiply this matrix.");
			return null;
		}
	}
	
	//返回矩阵的行数
	public int getNumberRows() {
		return rows;
	}
	
	//返回矩阵的列数
	public int getNumberColumns() {
		return columns;
	}
	
	//返回第i行第j列的元素
	public double get(int i, int j) {
		if (i > rows || i < 0) {
			System.err.println("Number \"i\" out of range: matrix[i][j]");
			return Double.NaN;
		} else if (j > columns && j < 0) {
			System.err.println("Number \"j\" out of range: matrix[i][j]");
			return Double.NaN;
		} else {
			return this.matrix[i][j];
		}
		
	}
	
	//返回该矩阵的文本表示
	public String toString() {
		String string = "";
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				string += String.valueOf(matrix[i][j] + "  ");
			}
			string += "\n";
		}
		return string;
	}
	
	//判断两个矩阵是否完全相同
	public boolean equals(Object v) {
		return false;
	}
	
	//返回一个新的m行m列的方阵，对角线元素为1，其余位置为0
	public static Matrix identityMatrix(int m) {
		Matrix resultMatrix = new Matrix(m, m);
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < m; j++) {
				if (i == j) {
					resultMatrix.matrix[i][i] = 1;
				} else {
					resultMatrix.matrix[i][j] = 0;
				}
			}
		}
		return resultMatrix;
	}
	
	//使用v的值填充矩阵
	public void fill(double v) {
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				this.matrix[i][j] = v;
			}
		}
	}
	
	
}
