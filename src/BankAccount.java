
public class BankAccount {
	private double balance;
	private String name;

	public BankAccount(double balance, String name) {
		this.balance = balance;
		this.name = name;
	}

	public void deposit(double deposit) {
		balance +=deposit;
	}

	public void withdraw(double withdraw) {
		balance -= withdraw;
	}

	public double getBalance() {
		return this.balance;
	}

	public String getName() {
		return name;
	}
	

}
