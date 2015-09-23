package quiz2;

import java.util.Scanner;

public class TuitionBill {
	private double APR;
	private double TuitionFee;
	private double IncreaseRate;
	private double RepaymentTime;
	private double MPR;
	private static double TotalTuitionFee;
	private static double monthlypayment;
	
	public static void main(String[] args) {
	//define type of these variables
	  double TuitionFee;
	  double APR;
	  double IncreaseRate;
	  double RepaymentTime;
	  double MPR;
	  double monthlypayment;
	  //Enter the Tuition Fee
	 Scanner input = new Scanner(System.in);
		System.out.println("Enter the Tuition Fee:");
		double number1 = input.nextDouble();
		
		
		//Enter the APR
		Scanner input1 = new Scanner(System.in);
		System.out.println("Enter the APR:");
		double number2 = input.nextDouble();
		
		//Enter the IncreaseRate
		Scanner input2 = new Scanner(System.in);
		System.out.println("Enter the IncreaseRate:");
		double number3 = input2.nextDouble();
		
		//Enter the RepaymentTime
		Scanner input3 = new Scanner(System.in);
		System.out.println("Enter the RepaymentTime:");
		double number4 = input3.nextDouble();
		
		
		
		//give values
		TuitionFee=number1;
		APR=number2;
		IncreaseRate=number3;
		RepaymentTime=number4;
		//calculate MPR
		 MPR=APR/12;
		 
		 for (int i = 1; i <=RepaymentTime ; i++){
			
			 TuitionFee = ((TuitionFee*IncreaseRate) +TuitionFee);
		 //calculate Total Tuition Fee
		 //calculate monthly payment
		 }
		 monthlypayment=(TuitionFee/RepaymentTime/12)*(1+MPR);
			 
		 
	   System.out.println("the Total Tuition Fee is: $"+TuitionFee);
	   
	   System.out.println("the monthly payment is: $"+monthlypayment);
	   
	   
	}
	public static double getmonthlypayment(double TuitionFee, int RepaymentTime, double MPR)
	{
		return monthlypayment=(TuitionFee/RepaymentTime/12)*(1+MPR);
		
	}
	public static double getTotalTuitionFee(double TuitionFee, int RepaymentTime, double IncreaseRate)
	{
		return TotalTuitionFee=TuitionFee*Math.pow(1+IncreaseRate, RepaymentTime);
		
	}
}
	
	


