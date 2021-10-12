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
//Kelas Public TestBanking
public class TestBanking {
    //Fungsi main
    public static void main(String[] args) {
        //Inisiasi Customer Berbeda
        Customer customer1=new Customer("Joel","Damanik");
        Customer customer2=new Customer("Michael","Jordan");
        
        //Inisiasi Account Berbeda
        //Inisiasi Account Berbeda
        Account[] accounts=new Account[10];
        accounts[0]=new Account(3000000);
        accounts[1]=new Account(2500000);
        for(int i=0;i<2;i++){
            try{
                accounts[i].withdraw(60000);
            }catch(OverdraftException ode){
                System.err.println("Eksepsi account"+i+"="+ode);
            }
        }
        
        Bank bank=new Bank();
        bank.addCustomers("Joe", "Damanik");
        bank.addCustomers("Djul", "Jojo");
        bank.getCustomer(0);
        bank.getNumOfCustomers();
        
        //Menge-Set customer dengan akun
        
        
        //Pemanggilan Fungsi Method
        customer1.display();
        accounts[0].deposit(500000);
        
        
        //Menge-Set customer dengan akun
        customer1.setAccount(accounts[0]);
        customer1.getNumOfAccounts();
        customer1.getAccount(1);
        
        customer2.setAccount(accounts[1]);
        customer2.getNumOfAccounts();
        customer2.getAccount(2);
        
        
        //Pemanggilan Fungsi Method
        customer2.display();
        accounts[1].deposit(550000);
        
        
    }
}
