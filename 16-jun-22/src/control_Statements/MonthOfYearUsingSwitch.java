package control_Statements;

public class MonthOfYearUsingSwitch {

	public static void main(String[] args) {
		
		String str="my";
		
		switch(str)
		{
		case "jan":
			System.out.println("This is january");
			break;
		case "feb":
			System.out.println("this is feb");
			break;
			
		case "march":
			System.out.println("this is march");
			
		case "april":
			System.out.println("this is april");
			break;
			
		case "may":
			System.out.println("this is may");
			break;
		case "jun":
			System.out.println("this is jun");
			
		case "july":
			System.out.println("this is july");
			break;
			
		case "august":
			System.out.println("this is august");
			break;
			
		case "sep":
			System.out.println("this is sep");
			break;
			
		case "oct":
			System.out.println("this is oct");
			break;
			
		case "nov":
			System.out.println("this is nov");
			break;
		case "dec":
			System.out.println("this is dec");
			break;
			default:
				System.out.println("wrong input");
		}

	}

}
