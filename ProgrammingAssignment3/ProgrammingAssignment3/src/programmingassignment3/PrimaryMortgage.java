/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programmingassignment3;

/**
 *
 * @author sebas
 */
public class PrimaryMortgage extends LoanAccount{
    private final double PMIMonthlyAmount;
    private final Address address;



    public PrimaryMortgage(double principle, double annualInterestRate, int months, double PMIMonthlyAmount, Address address) {
        super(principle, annualInterestRate, months);
        this.PMIMonthlyAmount = PMIMonthlyAmount;
        this.address = address;
    }

    @Override
    public String toString() {
        String monthlyPayment = String.format("%.2f", calculateMonthlyPayment());
        String principle2 = String.format("%.2f", getPrinciple());
        String PMIMonthlyAmount2 = String.format("%.2f", PMIMonthlyAmount);
        String annualInterestRate2 = String.format("%.2f", getAnnualInterestRate());
        
        String s1 = "\nPrimary Mortgage Loan with:\n" +
               "Principle: $" + principle2 +"\n" +
               "Annual Interest Rate: " + annualInterestRate2 + "%\n" +
               "Term of Loan in Months: " + getMonths() + "\n" +
               "Monthly Payment: $" + monthlyPayment + "\n" +
               "PMI Monthly Amount: $" + PMIMonthlyAmount2 + "\n" +
                address;
        
        return s1;
               
    }
    
    
}
