
public class AccountTest {
	public static void main(String args[]) {
		Account a = new Account("Account A", 100.0);
		Account b = new Account("Account B", 0);
		Account c = new Account("Account C", 0);
		
		Account.transfer(a, b, 50.0);
		Account.transfer(b, c, 25.0);
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}
