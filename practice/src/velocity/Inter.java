package velocity;

public class Inter implements TestInterface {

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("this is add method");
	}

	@Override
	public void mul() {
		// TODO Auto-generated method stub
		System.out.println("this is mul method");
	}

	@Override
	public void div() {
		// TODO Auto-generated method stub
		System.out.println("this is div method");
	}
	
	
	public static void main(String[] args) {
		Inter inter =new Inter();
		
		inter.add();
		inter.div();
		inter.mul();
	}
	

}
