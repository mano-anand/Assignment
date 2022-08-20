package week3.day1;

class BankInfo{
	public void saving() {
		int saving_amount = 25000;
		System.out.println(saving_amount);
	}
	public void fixed()
	{
		int durationoffixed = 2;
		System .out.println(durationoffixed);
	}
	public void deposit()
	{
		System.out.println("Deposited amount is 10000");
	}
}

public class AxisBank extends BankInfo {
	
	public void deposit()
	{
		System.out.println("Deposited amount is 50000");
	}

	public static void main(String[] args) {
		AxisBank obj1 = new AxisBank();
		obj1.saving();
		obj1.fixed();
		obj1.deposit();
		

	}

}
