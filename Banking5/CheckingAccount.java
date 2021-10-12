/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banking5;

/**
 *
 * @author Joel
 */
public class CheckingAccount extends Account{
   private double overdraftProtection;
    public CheckingAccount(double balance) {
        super(balance);
    }
    
    public CheckingAccount(double balance,double protect) {
        super(balance);
        this.overdraftProtection=protect;
    }
    
    /**
     *
     * @param amt
     * @return
     */
    @Override
    public void withdraw(double amt) throws OverdraftException{
        if(amt<=balance){
            balance=balance-amt;
        }
        else if(amt>=balance && overdraftProtection>0){
            balance=balance-amt+overdraftProtection;
            if(overdraftProtection>0){
                throw new OverdraftException("insuficient fund for overdraft protection",overdraftProtection);
            }
            else{
                throw new OverdraftException("no overdraft protection",overdraftProtection);
            }
        }
        else{
            throw new OverdraftException("no overdraft protection",overdraftProtection);
        }
    }
    
    
}
