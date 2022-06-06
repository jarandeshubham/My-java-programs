package practice;

public class MethodOverloading {

	
   public static int add(int a,int b)
   {
	   return a+b;
   }
   
   public static int add(int a,int b,int c)
   {
	   return a+b+c;
   }
	public static void main(String[] args) {
		
		System.out.println(MethodOverloading.add(4, 5));
		System.out.println(MethodOverloading.add(3,3,4));
		

	}

}
