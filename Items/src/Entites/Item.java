package Entites;

import java.time.LocalDate;

public class Item implements Comparable<Item>{

	private String Itemcode;
	private String description;
	private double price;
	private LocalDate ShipmentDate;
	
	public Item(String itemcode)
	{
		Itemcode=itemcode;
	}

	public Item(String itemcode, String description, double price, LocalDate shipmentDate) {
		super();
		Itemcode = itemcode;
		this.description = description;
		this.price = price;
		ShipmentDate = shipmentDate;
	}

	public String getItemcode() {
		return Itemcode;
	}

	public void setItemcode(String itemcode) {
		Itemcode = itemcode;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public LocalDate getShipmentDate() {
		return ShipmentDate;
	}

	public void setShipmentDate(LocalDate shipmentDate) {
		ShipmentDate = shipmentDate;
	}

	@Override
	public String toString() {
		return "Item [Itemcode=" + Itemcode + ", description=" + description + ", price=" + price + ", ShipmentDate="
				+ ShipmentDate + "]";
	}
	
	@Override
	public boolean equals(Object o)
	{
		if(o instanceof Item)
		{
			Item i=(Item)o;
			return this.Itemcode.equals(i.Itemcode);
		}
		return false;
	}

	@Override
	public int compareTo(Item o) {
		
		return this.Itemcode.compareTo(o.Itemcode);
	}
	
}
