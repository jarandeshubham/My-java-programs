package inheritance;

public class Animal_hierarchical 
{
 void eat()
 {
	 System.out.println("i am eating");
 }
}

class Dog extends Animal_hierarchical
{
	void run()
	{
		System.out.println("i am running");
	}
}
class Cat extends Animal_hierarchical
{
 void drink()
 {
	 System.out.println("i am drinking");
 }
}

class Test_inheritance
{
	public static void main(String[]args)
	{
		Cat c=new Cat();
		c.drink();
		c.eat();
	}
}