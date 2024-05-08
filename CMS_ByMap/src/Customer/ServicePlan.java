package Customer;

public enum ServicePlan {

	SILVER(1000) ,GOLD (2000),DIAMOND (5000),PLATINUM(10000);
	
	private double amount;
	ServicePlan(double amount)
	{
		this.amount=amount;
	}
	public double getamount()
	{
		return amount;
	}
}
