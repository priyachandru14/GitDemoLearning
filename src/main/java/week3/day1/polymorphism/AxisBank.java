package week3.day1.polymorphism;

public class AxisBank extends BankInfo {
	public void deposit()
	{
		super.deposit();
		System.out.println("Axis Bank deposit details");
	}
	public static void main(String[] args) {
		AxisBank bank=new AxisBank();
		bank.deposit();
	}
}
