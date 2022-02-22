package inheritance;

public class Animal_single
{
   void eat()
   {
	   System.out.println("eating...");
   }
}
class Dog extends Animal_single
{
	void run()
	{
		System.out.println("running...");
	}
}
class Testinheritance
{
	public static void main(String[] args)
	{
		Dog d=new Dog();
		d.run();
		d.eat();
	}
}
