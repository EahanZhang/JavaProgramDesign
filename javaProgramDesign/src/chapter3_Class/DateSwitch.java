package chapter3_Class;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.Year;

public class DateSwitch {
	public static void main(String[] args) throws IOException {
		BufferedReader stdin =					//输入流 
				new BufferedReader(new InputStreamReader(System.in));
		
		//输出信息并获得输入
		System.out.println("Date format translator");
		System.out.println("\tConverts a date from American format (e.g. , July 4, 1776)");
		System.out.println("\tTo standard format (e.g. , 1776-July-4).");
		System.out.println("\nEnter date in American format:");
		String americanDate = stdin.readLine().trim();
		
		//从输入信息中获取数据
		int firstSpaceLocation = americanDate.indexOf(" ", 0);
		int length = americanDate.length();
		String year = 
				americanDate.substring(length - 4, length);
		String day = 
				americanDate.substring(firstSpaceLocation + 1, firstSpaceLocation + 2);
		String month =
				americanDate.substring(0, firstSpaceLocation);
		
		//转换格式并输出
		String nationalDateFormat = year + "-" + month + "-" + day;
		System.out.println(nationalDateFormat);
	}
}
