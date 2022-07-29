package velocity;

public class Encapsulation {

	private int id;
	private String firstName;
	private String lastName;
	private String city;
	
	
	public void setId(int id)
	{
		if(id>0)
		{
			 this.id=id;
		}
		else
		{
			System.out.println("enter valid id number");
		}
	  
	  
	}
	
	public int getId()
	{
	   return this.id;
	}
	
	public void setFirstName(String f)
	{
		this.firstName=f;
	}
	
	public String getFristName()
	{
		return this.firstName;
	}
	
	public void setLastName(String l)
	{
		this.lastName=l;
	}
	public String getLastName()
	{
		return this.lastName;
	}
	public void setCityName(String c)
	{
		this.city=c;
		
	}	
	public String getCityName()
	{
		return this.city;
	}
	

}
