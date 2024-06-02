package entites;

public enum ServiceType {
SILVER(1000),GOLD(2000),DIAMOND(5000),PLATINUM(10000);
	public double planCost;

	private ServiceType(double planCost) {
		this.planCost = planCost;
	}

	public double getPlanCost() {
		return planCost;
	}
	
	
}
