/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banking6;
import java.text.NumberFormat;
import java.util.Locale;
/**
 *
 * @author Joel
 */
//Kelas Publik Account
public class Account {
    //Variabel dengan modifier private
    protected double balance;
    
    NumberFormat kurensiUS=NumberFormat.getCurrencyInstance(Locale.US);
    //Fungsi Konstruktor Account
    public Account(double init_balance){
        //Inisiasi objek konstruktor
        this.balance=init_balance;
    }
    
    //Fungsi Method getBalance
    public double getBalance(){
        return balance;
    }
    public boolean deposit(double amt){
        
        //Pengkondisian deposit
        if(amt>=100000){
            //Rumus total saldo
            balance=balance+amt;
            //Pemanggilan Output
            System.out.println("Selamat, Deposit Telah Berhasil Senilai:Rp "+amt);
            System.out.println("Saldo Anda:"+kurensiUS.format(balance));
            //Pengembalian nilai True
            return true;
        }
        else{
            System.out.println("Maaf, Nilai Deposit Anda Tidak Mencukupi Batas Minimum ");
            //Pengembalian nilai False
            return false;
        }
    }
    public boolean withdraw(double amt){
        if(amt<=balance){
            balance=balance-amt;
            System.out.println("Selamat, Penarikan Saldo Berhasil Senilai:Rp "+amt);
            System.out.println("Saldo Anda:"+kurensiUS.format(balance));
            return true;
        }
        else{
            System.out.println("Maaf, Saldo Anda Tidak Mencukupi");
            System.out.println("Saldo Anda:"+kurensiUS.format(balance));
            return false;
        }
    }
    
}
