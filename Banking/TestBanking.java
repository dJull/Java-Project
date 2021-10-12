/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banking;

/**
 *
 * @author Joel
 */
public class TestBanking {
    public static void main(String[] args) {
        Account acc=new Account(5000000);
        acc.deposit(300000);
        acc.withdraw(500000);
    }
}
