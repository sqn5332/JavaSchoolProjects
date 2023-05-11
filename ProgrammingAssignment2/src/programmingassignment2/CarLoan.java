/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programmingassignment2;

/**
 *
 * @author sebas
 */
public class CarLoan extends LoanAccount{
    private final String vehicleVIN;

    public CarLoan(double principle, double annualInterestRate, int months, String vehicleVIN) {
        super(principle, annualInterestRate, months);
        this.vehicleVIN = vehicleVIN;
    }
    
    @Override
    public String toString() {
        String monthlyPayment = String.format("%.2f", calculateMonthlyPayment());
        String principle2 = String.format("%.2f", getPrinciple());
        String annualInterestRate2 = String.format("%.2f", getAnnualInterestRate());
        
        String s1 = "\nCar Loan with:\n" +
               "Principle: $" + principle2 +"\n" +
               "Annual Interest Rate: " + annualInterestRate2 + "%\n" +
               "Term of Loan in Months: " + getMonths() + "\n" +
               "Monthly Payment: $" + monthlyPayment + "\n" +
               "Vehicle VIN: " + vehicleVIN + "\n";
               
       return s1;
           
       
       }
               
            
    }

    

