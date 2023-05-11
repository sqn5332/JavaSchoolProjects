/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programmingassignment1;

/**
 *
 * @author sebas
 */
public class ProgrammingAssignment1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       LoanAccount Loan1 = new LoanAccount(5000.00);
       LoanAccount Loan2 = new LoanAccount(31000.00);
       
       
       LoanAccount.setAnnualInterestRate(1);
       
       System.out.println("Monthly payments for loan1 of %5000.00 and loan2 of $31000.00 for 3, 5,and 6 year loans at 1% interest."  );
       
       System.out.printf("%s %s     %s     %s%n", "Loan ", "3 years", "5 years", "6 years");
       
       System.out.printf("%s", "Loan1");
       System.out.printf("%s %-10.2f %s %-10.2f %s %-10.2f%n","", Loan1.calculateMonthlyPayment(36),"",Loan1.calculateMonthlyPayment(60),"",Loan1.calculateMonthlyPayment(72));
     
       System.out.printf("%s", "Loan2");
       System.out.printf("%s %-10.2f %s %-10.2f %s %-10.2f%n","", Loan2.calculateMonthlyPayment(36),"",Loan2.calculateMonthlyPayment(60),"",Loan2.calculateMonthlyPayment(72));
       
       LoanAccount.setAnnualInterestRate(5);
       
       System.out.println("Monthly payments for loan1 of %5000.00 and loan2 of $31000.00 for 3, 5,and 6 year loans at 5% interest."  );
       
       System.out.printf("%s %s     %s     %s%n", "Loan ", "3 years", "5 years", "6 years");
       
       System.out.printf("%s", "Loan1");
       System.out.printf("%s %-10.2f %s %-10.2f %s %-10.2f%n","", Loan1.calculateMonthlyPayment(36),"",Loan1.calculateMonthlyPayment(60),"",Loan1.calculateMonthlyPayment(72));
     
       System.out.printf("%s", "Loan2");
       System.out.printf("%s %-10.2f %s %-10.2f %s %-10.2f%n","", Loan2.calculateMonthlyPayment(36),"",Loan2.calculateMonthlyPayment(60),"",Loan2.calculateMonthlyPayment(72));
    }
    
}
