/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programmingassignment3;

/**
 *
 * @author sebas
 */
public class LoanAccount {
    private final double principle;
    private final double annualInterestRate;
    private final int months;

    public LoanAccount(double principle, double annualInterestRate, int months) {
        this.principle = principle;
        this.annualInterestRate = annualInterestRate;
        this.months = months;
    }

    
 
    public double calculateMonthlyPayment(){
        double monthlyInterest = annualInterestRate/(100 * 12);
        double monthlyPayment = principle * (monthlyInterest/(1 - Math.pow(1 + monthlyInterest, -months)));
        return monthlyPayment;        
  
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public double getPrinciple() {
        return principle;
    }

    public int getMonths() {
        return months;
    }

    @Override
    public String toString() {
        String monthlyPayment = String.format("%.2f", calculateMonthlyPayment());
        String principle2 = String.format("%.2f", getPrinciple());
        String annualInterestRate2 = String.format("%.2f", getAnnualInterestRate());
        
        String s1 = "Loan with:\n" +
               "Principle: $" + principle2 +"\n" +
               "Annual Interest Rate: " + annualInterestRate2 + "%\n" +
               "Term of Loan in Months: " + getMonths() + "\n" +
               "Monthly Payment: $" + monthlyPayment;
        
        return s1;
    }

    
    
}
