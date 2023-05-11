/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programmingassignment3;

import java.util.ArrayList;



/**
 *
 * @author sebas
 */
public class Customer{
    private final String firstName;
    private final String lastName;
    private final String SSN;
    private final ArrayList<LoanAccount> loanAccounts = new ArrayList<>();

    public Customer(String firstName, String lastName, String SSN) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.SSN = SSN;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSSN() {
        return SSN;
    }
    
    public void addLoanAccount(LoanAccount account) {
        loanAccounts.add(account);
        
    }
    
    public String printMonthlyReport(){
        System.out.println("Account Report for Customer: " + getFirstName() + " " + getLastName() + " with SSN " +getSSN());
        for (LoanAccount i: loanAccounts) {
            System.out.println(i.toString());
        }
        String s1 = "\n";
        return s1;
        
    }
    
    
            
            
    
}
