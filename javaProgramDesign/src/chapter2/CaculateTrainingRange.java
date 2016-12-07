package chapter2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CaculateTrainingRange {
	public static void main(String[] args) throws IOException {
		final double LOWER_LIMIT = 0.65;				//下限
		final double UPPER_LIMIT = 0.80;			//上限
		final double ORIGEN = 220;					//初始值
		int age = 0;								//年龄
		BufferedReader stdin =						//输入流 
				new BufferedReader(new InputStreamReader(System.in));
		double lower_result = 0;					//下限结果
		double upper_result = 0;					//上限结果
		
		//获取输入
		System.out.println("Enter the age: ");
		age = Integer.parseInt(stdin.readLine());
		
		//使用公式计算值
		lower_result = (ORIGEN - age) * LOWER_LIMIT;
		upper_result = (ORIGEN - age) * UPPER_LIMIT;
		
		//输出结果
		System.out.println("The rate of the age is between " + lower_result +
				" and " + upper_result + ". ");
		
		
	}
}