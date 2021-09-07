// Jennifer Miller - Module 2 //
import java.util.*;
// an application that creates an array of five loans
public class CreateLoan implements LoanConstants {
	public static void main(String[] args) {
		Loan arrayLoan[] = new Loan[5];
		Scanner sc = new Scanner(System.in);
		double primeRate,loanAmount;
		int loanType,loanNumber,loanTerm;
		String customerLastName;
		// prompt the user for the current prime interest rate
		System.out.println("Welcome to " + COMPANY_NAME + "!\n");
		System.out.println("Please enter the current prime interest rate to the hundredth (ie: 0.05).");
		primeRate = Double.parseDouble(sc.nextLine());
		// in a loop, prompt the user for the loan information
		for(int i=0; i < arrayLoan.length; i++) {
			System.out.println("Please enter (1) if this is a business loan or (2) if this is a personal loan.");
			loanType = Integer.parseInt(sc.nextLine());
			System.out.println("Please enter the loan number.");
			loanNumber = Integer.parseInt(sc.nextLine());
			System.out.println("Please enter the customer's last name.");
			customerLastName = sc.nextLine();
			System.out.println("Please enter the amount of the loan.");
			loanAmount = Double.parseDouble(sc.nextLine());
			System.out.println("Please enter the term for the loan in the amount of years.");
			loanTerm = Integer.parseInt(sc.nextLine());
			if(loanType == 1)          
				arrayLoan[i] = new BusinessLoan(loanNumber,customerLastName,loanAmount,loanTerm,primeRate);
			else if(loanType == 2)          
				arrayLoan[i] = new PersonalLoan(loanNumber,customerLastName,loanAmount,loanTerm,primeRate);
			else {
				throw new IllegalArgumentException("Please Select proper loan type");
			}          
		}
		// store the created Loan objects in the array
		for(int j=0; j < arrayLoan.length; j++)
			System.out.println(arrayLoan[j]);
		// when data is complete, display all the loans
		sc.close();
	}
}
