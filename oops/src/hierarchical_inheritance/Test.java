package hierarchical_inheritance;

public class Test {

	public static void main(String[] args) {
		
		HomeLoan homeLoan=new HomeLoan();
		  homeLoan.getLoanDetail();
		  homeLoan.getHomeLoanDetail();
		  
	      CarLoan carLoan=new CarLoan();
		  carLoan.getCarLoanDetail();
		  
		  EducationLoan educationLoan=new EducationLoan();
		  
		  educationLoan.getEducationLoandetail();
	}
  
  
}
