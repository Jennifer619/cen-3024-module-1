// Jennifer Miller - Module 2 //
// public abstract class that implements LoanConstants
public abstract class Loan implements LoanConstants {
	// variables: loan number, customer last name, amount of loan, interest rate, and term
	protected int loanNumber;
	protected String customerLastName;
	protected double loanAmount;
	protected double interestRate;
	protected int loanTerm;
	// constructor requires data for each variable except interest rate
	public Loan(int number, String name, double amount, int term) {
		// do not allow loans greater than $50000
		if(amount > 50000)
			throw new IllegalArgumentException("Loan amount cannot be greater than $50,000.");
			loanNumber = number;
			customerLastName = name;
			loanAmount = amount;
		// force any loan term that is not one of the three defined in LC to short term
			if(term == MEDIUM_TERM || term == LONG_TERM)
			loanTerm = term;
			else
			loanTerm = SHORT_TERM;
	}
	// create a toString to display all loan data
	@Override
	public String toString() {
		return "Loan #" + loanNumber + ": " + customerLastName + 
				"\n $" + loanAmount + 
				"\n for " + loanTerm + " year(s) at " + Math.round(interestRate*100.0*100.0)/100.0 + "% interest";
	}
	// create a equals() method to compare if two loans are equivalent
	public boolean equals(Loan loan) {
	       if(this.loanNumber == loan.loanNumber && 
	    		   customerLastName == loan.customerLastName && 
	    		   loanAmount == loan.loanAmount && 
	    		   loanTerm == loan.loanTerm)
	           return true;
	       else
	           return false;
	   }
}
