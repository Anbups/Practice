package week2.day1;

public class AxisBank extends BankInfo {
	public int deposit() {return 11;}
	
	public static void main(String[] args) {
		AxisBank abank = new  AxisBank();
		
		int axdep = abank.deposit();
		System.out.println("axis gives intrest for deposit  "+ axdep +" %");
		int bankfix= abank.fixed();
		System.out.println("if you deposit the minimum amount  " + bankfix +" %");
		int bankSavings = abank.savings();
		System.out.println("bank provides intrest for saving  " +bankSavings +" %");
		
	}
}
