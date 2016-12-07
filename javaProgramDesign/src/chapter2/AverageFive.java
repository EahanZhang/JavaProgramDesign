package chapter2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AverageFive {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		final int LIST_SIZE = 5;	//输入数值的个数
		float sum = 0;				//总和
		float currentValue = 0;		//当前输入的值
		BufferedReader stdin = 		//输入流
				new BufferedReader(new InputStreamReader(System.in));
		
		//处理输入并计算输入的总和
		for (int i = 0; i < LIST_SIZE; i++) {
			System.out.println("Enter a number please:");
			currentValue = Float.parseFloat(stdin.readLine());
			sum += currentValue;
		}
		
		//求平均数
		float average = sum / LIST_SIZE; 
		
		//输出平均数
		System.out.println("The average of your input is " + average + ".");
	}

}
