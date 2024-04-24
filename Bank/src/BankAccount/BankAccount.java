package BankAccount;

public class BankAccount {
	private int accountid;
    private String accountHolder;
    private double balance;
    private static int counter=0;
    

	public BankAccount(int accountid, String accountHolder,double balance) {
		// TODO Auto-generated constructor stub
		counter++;
		this.accountid=accountid;
		this.accountHolder=accountHolder;
		this.balance=balance;
	}


	public int getAccountid() {
		return accountid;
	}


	public void setAccountid(int accountid) {
		this.accountid = accountid;
	}


	public String getAccountHolder() {
		return accountHolder;
	}


	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void deposit(double amount)
	{
		balance=balance+amount;
		System.out.println("Balance after deposit is : "+balance);
	}
	public void withdraw(double amount)
	{
		if(balance>amount)
		{
		balance=balance-amount;
		System.out.println("Balance after withdraw is :  "+balance);
		}
		else
			System.out.println("Insufficient balance");
	}
	public static void Bankaccountcount()
	{
		System.out.println("Number of account in a bank is : "+counter);
	}
	
	public void displayAccountdetails()
	{
		System.out.println("Account Id is : "+accountid+" \n Name of account holder : "+accountHolder+"\n Balance is : "+balance);
	}
	/*@Override
	public String toString()
	{
		return "Account Id is : "+accountid+" \n Name of account holder : "+accountHolder+"\n Balance is : "+balance;
	}*/
	


}
