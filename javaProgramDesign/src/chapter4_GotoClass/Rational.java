package chapter4_GotoClass;

public class Rational {
	private int mNumerator;
	private int mDenominator;
	
	public Rational(int numerator, int denominator) {
		// TODO Auto-generated constructor stub
		mNumerator = numerator;
		mDenominator = denominator;
	}
	
	public void add(Rational rational) {
		//加法运算
		int numerator = mNumerator * rational.getDenominator()
				+ mDenominator * rational.getNumerator();
		int denominator = mDenominator * rational.getDenominator();
		int num = getGreatestCommonDivisor(numerator, denominator);
		
		numerator /= num;
		denominator /= num;
		
		System.out.println("\tr + s = " + numerator + "/" + denominator);
	}
	
	public void delete(Rational rational) {
		//减法
		int numerator = mNumerator * rational.getDenominator()
				- mDenominator * rational.getNumerator();
		int denominator = mDenominator * rational.getDenominator();
		int num = getGreatestCommonDivisor(numerator, denominator);
		
		numerator /= num;
		denominator /= num;
		
		System.out.println("\tr - s = " + numerator + "/" + denominator);
	}
	
	public void multiply(Rational rational) {
		//乘法运算
		int numerator = mNumerator * rational.getNumerator();
		int denominator = mDenominator * rational.getDenominator();
		//计算最大公约数
		int num = getGreatestCommonDivisor(numerator, denominator);
		//约分
		numerator /= num;
		denominator /= num;
		//输出结果
		System.out.println("\tr * s = " + numerator + "/" + denominator);
	}
	
	public void divide(Rational rational) {
		//除法运算
		int numerator = mNumerator * rational.getDenominator();
		int denominator = mDenominator * rational.getNumerator();
		//计算最大公约数
		int num = getGreatestCommonDivisor(numerator, denominator);
		//约分
		numerator /= num;
		denominator /= num;
		//输出结果
		System.out.println("\tr / s = " + numerator + "/" + denominator);
	}
	
	public int getGreatestCommonDivisor(int num1, int num2) {
		int num = 1;
		while (num > 0) {
			num = num1 % num2;
			num1 = num2;
			num2 = num;
		}
		return num1;
	}
	
	public void setNumerator(int num) {
		mNumerator = num;
	}
	
	public void setDenominator(int num) {
		mDenominator = num;
	}
	
	public int getNumerator() {
		return mNumerator;
	}
	
	public int getDenominator() {
		return mDenominator;
	}
	
	
}
