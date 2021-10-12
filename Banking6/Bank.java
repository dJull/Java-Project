/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banking6;

/**
 *
 * @author Joel
 */
public class Bank {
    private static Bank bankInstance=null;
    
    private Customer[] customers;
    private int numberOfCustomer;
    
    
    private Bank(){
        customers=new Customer[6];
    }
    
    public int getNumOfCustomers(){
        return numberOfCustomer;
    }
   
    public Customer getCustomer(int index){
        return customers[index];
    }
    
    public void addCustomers(String f, String l){
       customers=new Customer[numberOfCustomer++];
    }
    
    public static Bank getBank() 
    { 
        // To ensure only one instance is created 
        if (bankInstance == null) 
        { 
            bankInstance = new Bank(); 
        } 
        return bankInstance; 
    }
}
