package Fruit;

public class Orange extends Fruit{

	public String taste()
	{
		return "Sour";
	}
	
	public void Juice()
	{
		System.out.println("Orange juice is created");
	}
	
	@Override
	public String toString()
	{
		return this.getname() + this.getWeight() + this.getColor() + this.isFresh();
	}
}
