// Jennifer Miller - Module 2 //
// public class that extends Loan
public class PersonalLoan extends Loan {
	// constructor sets interest rate to 2 % more than current prime rate
	public PersonalLoan(int number, String name, double amount, int term, double prime) {
		super(number,name,amount,term);
		this.interestRate = prime + 0.02;
	}
}
