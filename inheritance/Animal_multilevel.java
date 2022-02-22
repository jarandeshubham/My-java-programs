package inheritance;

public class Animal_multilevel 
{
 void eat()
 {
	 System.out.println("eating....");
 }
}

class Tiger extends Animal_multilevel
{
	void bark()
	{
		System.out.println("barking...");
	}
}

class horse extends Tiger
{
	void hor()
	{
		System.out.println("runing...");
	}
}

class test_inheritance
{
	public static void main(String[] args)
	{
		horse h=new horse();
		h.eat();
		h.bark();
		h.hor();
	}
}