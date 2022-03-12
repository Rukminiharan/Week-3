package week3.day2;

public class SBI implements RBI {

	//only in the implementation class for the interface can pass the parameters

	public void openAccount() {
	System.out.println("To Open your Account please provide your National Identity ");
		
	}

	public void provideDebitCard() {

    System.out.println("Please contact your nearest branch to get your debit card");
		
	}

	public void provideCreditCard() {
		
		System.out.println("Please read other terms and conditions");
		
	}
}
