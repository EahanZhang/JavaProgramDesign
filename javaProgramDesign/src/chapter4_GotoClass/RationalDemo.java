package chapter4_GotoClass;

import java.io.*;

public class RationalDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//输入流
		BufferedReader stdin = 
				new BufferedReader(new InputStreamReader(System.in));
		//提示输入
		System.out.println("Enter numerator of a rational number:");
		int num1 = Integer.parseInt(stdin.readLine());
		System.out.println("Enter denominator of a rational number:");
		int deno1 = Integer.parseInt(stdin.readLine());
		System.out.println("\nEnter numerator of a rational number:");
		int num2 = Integer.parseInt(stdin.readLine());
		System.out.println("Enter denominator of a rational number:");
		int deno2 = Integer.parseInt(stdin.readLine());
		
		//创建Rational对象并初始化
		Rational rational1 = new Rational(num1, deno1);
		Rational rational2 = new Rational(num2, deno2);
		
		//计算
		rational1.add(rational2);
		rational1.delete(rational2);
		rational1.multiply(rational2);
		rational1.divide(rational2);
	}

}
