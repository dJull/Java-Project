/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banking3;

/**
 *
 * @author Joel
 */


public class Bank {
    private Customer[] customers;
    private int numberOfCustomer;
    
    public Bank(){
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
    
}
