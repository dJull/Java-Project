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
public class CustomerReport {
    public static void main(String[] args) {
        //Inisiasi Customer Berbeda
        Customer customer1=new Customer("Joel","Damanik");
        Customer customer2=new Customer("Michael","Jordan");
        
        //Inisiasi Account Berbeda
        Account account1=new Account(3000000);
        Account account2=new Account(2500000);
        
        //Pemanggilan Fungsi Method
        customer1.display();
        account1.deposit(500000);
        account2.withdraw(200000);
        
        //Menge-Set customer dengan akun
        customer1.setAccount(account1);
        customer1.getNumOfAccounts();
        customer1.getAccount(1);
        
        customer2.setAccount(account2);
        customer2.getNumOfAccounts();
        customer2.getAccount(2);
    }
}
