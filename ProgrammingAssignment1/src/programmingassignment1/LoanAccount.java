/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programmingassignment1;

/**
 *
 * @author sebas
 */
public class LoanAccount {
    private static float annualInterestRate;
    private double principle;

    public LoanAccount(double principle) {
        this.principle = principle;
    }
    
    public double calculateMonthlyPayment(int numberOfPayments) {
        double monthlyInterest = annualInterestRate/12;
        double monthlyPayment = principle * (monthlyInterest/(1 - Math.pow(1 + monthlyInterest, -numberOfPayments)));
        return monthlyPayment;
    }
    
    
    public static void setAnnualInterestRate(float newAnnualInterestRate) {
        annualInterestRate = newAnnualInterestRate/100;
    }
        
    
    
    
}
