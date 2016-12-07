package chapter7usefunctionandclass;

public class Carloan {
	double balance;
	double sum;
	
	//计算期限为limitMonth的简单利息贷款第currentMonth的余额
	double simpleInterestLoanBalance(double currentMonth, double money,
			double annualInterestRate, double limitMonth) {
		//double a = 1 + (annualInterestRate / 12);
		double a = (1 + annualInterestRate) / 12;
		double p = payEachMonth(money, annualInterestRate, limitMonth);
		
		System.out.println("a = " + a);
		System.out.println("p = " + p);
		
		balance = (money * Math.pow(a, currentMonth) 
				- (p * Math.pow(a, currentMonth - 1) / annualInterestRate));
		sum = money - p * (currentMonth - 1) + balance;
		return balance;
	}
	
	//计算期限为limitMonth的预付款利息贷款第currentMonth月的余额
	double prepaymentInterestLoanBalance(double currentMonth, double money,
			double annualInterestRate, double limitMonth) {
		
		return 0;
	}
	
	//计算期限为limitMonth的简单利息贷款到第currentMonth月的总利息
	double simpleInterestLoanCurrentInterest (double currentMonth, double money,
			double annualInterestRate, double limitMonth) {
		
		return 0;
	}
	
	//计算每月偿还的数目
	double payEachMonth (double money, double annualInterestRate, double limitMonth) {
		//double a = 1 + (annualInterestRate / 12);
		double a = (1 + annualInterestRate) / 12;
		double p = (money * annualInterestRate * Math.pow(a, limitMonth))
				/ (Math.pow(a, limitMonth) - 1);
		return p; 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carloan carloan = new Carloan();
		System.out.println(carloan.simpleInterestLoanBalance(
				5, 10000, 7, 36));
		System.out.println(carloan.payEachMonth(10000, 7, 36));
	}

}
