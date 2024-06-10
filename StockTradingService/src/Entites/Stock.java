package Entites;

import java.time.LocalDate;

public class Stock {

	private String stockId;
	private String stockname;
	private String companyname;
	private double price;
	private LocalDate closingDate;
	private int qty;
	
	public Stock(String stockId, String stockname, String companyname, double price, LocalDate closingDate, int qty)
	{
		this.stockId = stockId;
		this.stockname = stockname;
		this.companyname = companyname;
		this.price = price;
		this.closingDate = closingDate;
		this.qty = qty;
	}

	public String getStockId() {
		return stockId;
	}

	public void setStockId(String stockId) {
		this.stockId = stockId;
	}

	public String getStockname() {
		return stockname;
	}

	public void setStockname(String stockname) {
		this.stockname = stockname;
	}

	public String getCompanyname() {
		return companyname;
	}

	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public LocalDate getClosingDate() {
		return closingDate;
	}

	public void setClosingDate(LocalDate closingDate) {
		this.closingDate = closingDate;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	@Override
	public String toString() {
		return "Stock [stockId=" + stockId + ", stockname=" + stockname + ", companyname=" + companyname + ", price="
				+ price + ", closingDate=" + closingDate + ", qty=" + qty + "]";
	}
	
	@Override
	public boolean equals(Object o)
	{
		if(o instanceof Stock)
		{
			Stock s=(Stock)o;
			return this.stockId.equals(s.stockId);
		}
		return false;
	}
}
