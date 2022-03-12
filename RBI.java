package week3.day2;

public interface RBI {

	//String accountHolderName;
	//long accountNumber;
	//public static final String accountHolderName1 = "";
	//public static final long accountNumber1 = 0;
	
	//had doubts in declaring variables
	
	/**
	 * In RBI and open an account either directly in banks or over netbanking.
	 * The minumum amount of balance should be 500INR.
	 */
	public void openAccount();
	
	/**
	 * The bank also provides debit card to perform all the transactions.
	 * The customers should ensure to operate the debit cards at least once in a month.
	 */
	public void provideDebitCard();
}
