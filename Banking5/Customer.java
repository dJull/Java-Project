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
//Kelas Publik Customer
public class Customer {
    //Variabel dengan modifier private
    private String firstName;
    private String lastName;
    private Account account;
    private Account addAccount;
    private Bank numberOfCustomer;
    
    //Fungsi Konstruktor Customer
    public Customer(String f, String l){
        //inisiasi objek konstruktor
        this.firstName=f;
        this.lastName=l;
    }
    
    //Fungsi Method
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    
    public Account addAccount(){
        return addAccount;
    }
    
    //Fungsi Konstruktor setAccount
    public int getAccount(int getAcc){
        return getAcc;
    }
    
    public Bank getNumOfAccounts(){
        return numberOfCustomer;
    }
    
    public void setAccount(Account acct){
        this.account=acct;
    }
    
    //Fungsi Method
    public void display(){
        System.out.println("\nNama:"+firstName+" "+lastName);
    }
    
}
