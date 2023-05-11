/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programmingassignment2;

/**
 *
 * @author sebas
 */
public class UnsecuredLoan extends LoanAccount {

    public UnsecuredLoan(double principle, double annualInterestRate, int months) {
        super(principle, annualInterestRate, months);
    }
    
    
    

    @Override
    public String toString() {
        String monthlyPayment = String.format("%.2f", calculateMonthlyPayment());
        String principle2 = String.format("%.2f", getPrinciple());
        String annualInterestRate2 = String.format("%.2f", getAnnualInterestRate());
        
        String s1 = "\n" + "Unsecured Loan with:\n" +
               "Principle: $" + principle2 +"\n" +
               "Annual Interest Rate: " + annualInterestRate2 + "%\n" +
               "Term of Loan in Months: " + getMonths() + "\n" +
               "Monthly Payment: $" + monthlyPayment;
        
        return s1;
    }
    
}
