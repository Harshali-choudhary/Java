package Fruit;

public class Mango extends Fruit{

	public String taste()
	{
		return "Sweet";
	}
	
	public void Pulp()
	{
		System.out.println("Pulp extract from mango");
	}
	
	@Override
	public String toString()
	{
		return this.getname() + this.getWeight() + this.getColor() + this.isFresh();
	}
}
