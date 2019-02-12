package course;

public class Account {

	private int client_number;
	private String name;
	private double money;
	
	public Account(int client_number, String name, double money) {
		super();
		this.client_number = client_number;
		this.name = name;
		deposit(money);
	}

	public Account(int client_number, String name) {
		super();
		this.client_number = client_number;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getClient_number() {
		return client_number;
	}

	public double getMoney() {
		return money;
	}
	
	public void deposit(double ammount) {
		money += ammount;
	}
	
	public void withdraw(double ammount) {
		money -= ammount + 5;
	}
	
	public String accountData() {
		return "Updated account data: "
				+ "Account "+
				getClient_number() +
				", Holder: " +
				getName()+
				", Balance: $"
				+ getMoney();
	}
	
	
}
