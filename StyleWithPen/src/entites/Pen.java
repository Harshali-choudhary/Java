package entites;

import java.time.LocalDate;

public class Pen {

	private int Pid;
	private Brand brand;
	private String color;
	private String inkColor;
	private String material;
	private int stock;
	private LocalDate stockUpdatedate;
	private LocalDate stockListingdate;
	private double price;
	private double discount;
	private static int counter=1;
	
	
	public Pen(int pid) {
		super();
		Pid = pid;
	}

	public Pen( Brand brand, String color, String inkColor, String material, int stock,
			LocalDate stockUpdatedate, LocalDate stockListingdate, double price, double discount) {
		super();
		Pid = counter++;
		this.brand = brand;
		this.color = color;
		this.inkColor = inkColor;
		this.material = material;
		this.stock = stock;
		this.stockUpdatedate = stockUpdatedate;
		this.stockListingdate = stockListingdate;
		this.price = price;
		this.discount = discount;
	}

	public int getPid() {
		return Pid;
	}

	public void setPid(int pid) {
		Pid = pid;
	}

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getInkColor() {
		return inkColor;
	}

	public void setInkColor(String inkColor) {
		this.inkColor = inkColor;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public LocalDate getStockUpdatedate() {
		return stockUpdatedate;
	}

	public void setStockUpdatedate(LocalDate stockUpdatedate) {
		this.stockUpdatedate = stockUpdatedate;
	}

	public LocalDate getStockListingdate() {
		return stockListingdate;
	}

	public void setStockListingdate(LocalDate stockListingdate) {
		this.stockListingdate = stockListingdate;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	@Override
	public String toString() {
		return "Pen [Pid=" + Pid + ", brand=" + brand + ", color=" + color + ", inkColor=" + inkColor + ", material="
				+ material + ", stock=" + stock + ", stockUpdatedate=" + stockUpdatedate + ", stockListingdate="
				+ stockListingdate + ", price=" + price + ", discount=" + discount + "]";
	}
	
	@Override
	public boolean equals(Object o)
	{
		if(o instanceof Pen)
		{
			Pen p=(Pen)o;
			return p.Pid==this.Pid;
		}
		return false;
	}
	
	
}
