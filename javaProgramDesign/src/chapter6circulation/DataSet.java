package chapter6circulation;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Calendar;

public class DataSet {
	private int n;						//当前数据集合中值得数目
	private double mSum;				//总和
	private double mMinimumValue;		//最大值
	private double mMaximumValue;		//最小值
	
	public DataSet() {
		// TODO Auto-generated constructor stub
		clear();
	}
	
	public DataSet(String s) throws IOException {
		load(s);
	}
	
	public void clear() {
		n = 0;
		mSum = 0;
		mMaximumValue = Double.NaN;
		mMinimumValue = Double.NaN;
	}
	
	//从文件中获得数字
	public void load(String s) throws IOException {
		//新建一个输入流，为文件获取以个读指针
		BufferedReader fileIn = new BufferedReader(new FileReader(s));
		
		//从文件中读取数据，并处理
		String currentLine = fileIn.readLine();
		while (currentLine != null) {
			double currentNumber = Double.parseDouble(currentLine);
			addValue(currentNumber);
			currentLine = fileIn.readLine();
		}
		
		//关闭文件流
		fileIn.close();
	}
	
	public void addValue(double x) {
		mSum += x;
		++n;
		if (n == 1) {
			mMaximumValue = mMinimumValue = x;
		} else if (x < mMinimumValue) {
			mMinimumValue = x;
		} else if (x > mMaximumValue) {
			mMaximumValue = x;
		}
	}
	
	//取得数据集平均值
	public double getAverage() {
		if (n == 0) {
			return Double.NaN;
		} else {
			return mSum / n;
		}
	}
	
	//取得最小值
	public double getMinimumNumber() {
		return mMinimumValue;
	}
	
	//取得最大值
	public double getMaximumNumber() {
		return mMaximumValue;
	}
	
	//取得数据集大小
	public int getSize() {
		return n;
	}
}
