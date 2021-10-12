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
    public boolean withdraw(double amt){
        if(amt<=balance){
            balance=balance-amt;
            System.out.println("Selamat, Penarikan Saldo Berhasil Senilai:Rp "+amt);
            System.out.println("Saldo Anda:Rp"+balance);
            return true;
        }
        else if(amt>=balance && overdraftProtection>0){
            balance=balance-amt+overdraftProtection;
            if(balance>0){
                System.out.println("Selamat Anda Memiliki Overdraft Protection Yang Cukup");
                System.out.println("Saldo Anda:Rp"+balance);
                return true;
            }
            else{
                System.out.println("Maaf, Anda Tidakk Memiliki Overdraft Protection Yang Cukup");
                System.out.println("Saldo Anda:Rp"+balance);
                return false;
            }
        }
        else{
            System.out.println("Maaf, Anda tidak memiliki saldo yg cukup dan overdrive yg cukup untuk melakukan transaksi ini");
            System.out.println("Saldo Anda:Rp"+balance);
            return false;
        }
    }
    
}
