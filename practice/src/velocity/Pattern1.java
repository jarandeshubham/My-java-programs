package velocity;

public class Pattern1 {

	public static void main(String[] args) {
		
		for(int i=0;i<5;i++)      //i=0 i=1 i=2
		{
			for(int j=0;j<=i;j++)   //j=0 
			{
				System.out.print("*");  //*
				                        //**
				                        //***
			}
			System.out.println();
		}

	}

}
