package Fruit;

public abstract class Fruit {

	private String name;
	private double weight;
	private String color;
	private String fresh;
	
	public void setname(String name)
	{
		this.name=name;
	}
	public String getname()
	{
		return name;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String isFresh() {
		
		return fresh;
	}
	public void setFresh(String fresh) {
		this.fresh = fresh;
	}
	
//	public String setFreshness(String Fresh)
//	{
//		this.fresh=Fresh;
//		return Fresh;
//		
//	}
	public abstract String taste();
	@Override
	public String toString()
	{
		return "Name of fruit : "+ name + " weight : " + " color : " + " Fresh : " + fresh;	
	}
	public String setFreshness( String fresh) {
		
		return this.fresh = fresh;
		
	}
	@Override
	public boolean equals(Object o)
	{
		if(o instanceof Fruit)
		{
				return this.fresh.equals(o);
		}
		return false;
	}
}
	