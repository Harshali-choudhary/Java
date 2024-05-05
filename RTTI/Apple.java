package Fruit;

public class Apple extends Fruit {
	public String taste()
	{
		return "Sweet and Sour";
	}
	
	public void Jam()
	{
		System.out.println("Jam is made by apple ");
	}
	
	@Override
	public String toString()
	{
		return this.getname() + this.getWeight() + this.getColor() + this.isFresh();
	}

}
