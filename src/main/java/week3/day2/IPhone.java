package week3.day2;

public class IPhone implements Mobile {
	public void sendSMS() {
		System.out.println("Send SMS");		
	}

	public void dialNumber() {
		System.out.println("Dial Number");		
	}

	public void switchON() {
		System.out.println("Switch On");		
	}

	public static void main(String[] args) {
		 IPhone phone = new  IPhone();
		 phone.dialNumber();
		 phone.sendSMS();
		 phone.switchON();
		 
	}

	

}
