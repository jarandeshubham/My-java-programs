package practice;

 class Vehi 
 {
	 void run()
{
	System.out.println("vehi is running");
}

 }

 class Bike extends Vehi
{
   void run()
   {
	   System.out.println("bike is running");
   }
   public static void main(String [] args)
   {
	   Bike b=new Bike();
	   Vehi c=new Vehi();
	   b.run();
	   
   }
}


