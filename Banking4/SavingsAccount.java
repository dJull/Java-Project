/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banking4;

/**
 *
 * @author Joel
 */
public class SavingsAccount extends Account {
    private double interestRate;
    
    public SavingsAccount(double balance,double interest_rate) {
        super(balance);
        this.interestRate=interest_rate;
    }
    
}
