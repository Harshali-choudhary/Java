package entites;

public enum accounttype {
	SAVINGS(1000),CURRENT(5000),FD(50000),LOAN(100000),DMAT(40000),NRE(150000);
	
	public final int getMin;

	

	private accounttype(int getMin) {
		this.getMin = getMin;
	}



	public int getGetMin() {
		return getMin;
	}
	
	

}
