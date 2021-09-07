// Jennifer Miller - Module 2 //
// public class that extends Loan
public class BusinessLoan extends Loan {
	// constructor sets interest rate to 1% more than current prime rate
	public BusinessLoan(int number, String name, double amount, int term, double prime) {
		super(number,name,amount,term);
		this.interestRate = prime + 0.01;
	}
}
