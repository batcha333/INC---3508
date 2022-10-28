abstract class Animals
{
	abstract void cats();
	abstract void dogs();
} 
class Cats extends Animals
{
	void cats()
	{
		System.out.println("Cat meows!! :)");
	}
	void dogs(){}
}
class Dogs extends Animals
{
	void dogs()
	{
		System.out.println("Dogs barks!! :)");
	}
	void cats(){}
}
class AnimalsAbstractDemo
{
	public static void main(String args[])
	{
		Animals c = new Cats();
		Animals d = new Dogs();
		c.cats();
		d.dogs();
	}
}