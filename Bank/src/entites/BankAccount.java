package entites;

public class BankAccount {

			private int accountNo;
			private String firstName;
			private String lastname;
			private accounttype acctype;
			private String dob;
			private String acc_creationDate;
			private double balance;
			public BankAccount() {
				
			}
			public BankAccount(int accountNo, String firstName, String lastname, accounttype acctype, String dob,
					String acc_creationDate, double balance) {
				
				this.accountNo = accountNo;
				this.firstName = firstName;
				this.lastname = lastname;
				this.acctype = acctype;
				this.dob = dob;
				this.acc_creationDate = acc_creationDate;
				this.balance = balance;
			}
			public BankAccount(int accno) {
				accountNo=accno;
			}
			public int getAccountNo() {
				return accountNo;
			}
			public void setAccountNo(int accountNo) {
				this.accountNo = accountNo;
			}
			public String getFirstName() {
				return firstName;
			}
			public void setFirstName(String firstName) {
				this.firstName = firstName;
			}
			public String getLastname() {
				return lastname;
			}
			public void setLastname(String lastname) {
				this.lastname = lastname;
			}
			public accounttype getAcctype() {
				return acctype;
			}
			public void setAcctype(accounttype acctype) {
				this.acctype = acctype;
			}
			public String getDob() {
				return dob;
			}
			public void setDob(String dob) {
				this.dob = dob;
			}
			public String getAcc_creationDate() {
				return acc_creationDate;
			}
			public void setAcc_creationDate(String acc_creationDate) {
				this.acc_creationDate = acc_creationDate;
			}
			public double getBalance() {
				return balance;
			}
			public void setBalance(double balance) {
				this.balance = balance;
			}
			
			public double withdraw(double balance,double amount)
			{
				if(balance<amount)
				{
					System.out.println("insufficient balance");
				}
				
				double total=balance-amount;
					return total;
			}
			
			public double deposit(double balance,double amount)
			{
				double total=balance+amount;
				return total;
			}
			@Override
			public String toString() {
				return "BankAccount [accountNo=" + accountNo + ", firstName=" + firstName + ", lastname=" + lastname + ", dob="
						+ dob + ", acc_creationDate=" + acc_creationDate + ", balance=" + balance + "]";
			}
			
			public boolean equals(Object o)
			{
				if(o instanceof BankAccount )
				{
					BankAccount b=(BankAccount)o;
					return this.accountNo == b.accountNo;
				}
				return false;
			}
			
			
			
		}

		
	



