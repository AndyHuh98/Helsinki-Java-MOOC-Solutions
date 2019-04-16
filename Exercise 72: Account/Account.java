public class Account {
	private String accountName;
	private double accountBalance;
	
	public Account() {
		accountName = "No name given";
		accountBalance = 0.0;
	}
	
	public Account(String name, double balance) {
		accountName = name;
		accountBalance = balance;
	}
	
	public static void transfer(Account from, Account to, double amount) {
		if (amount > 0) {
			from.accountBalance -= amount;
			to.accountBalance += amount;
		}
	}
	
	@Override
	public String toString() {
		return String.format("Account: %s%nBalance: %.2f%n", accountName, accountBalance);
	}
}
