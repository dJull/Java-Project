/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas6_5;

/**
 *
 * @author Joel
 */
public abstract class Animal {
    protected int legs;
    protected void Animal(int legs){
        this.legs=legs;
    }
    
    public void walk(){
        System.out.println("Hewan Dapat Berjalan");
    }
    
    public void eat(){
        System.out.println("Hewan Dapat Makan");
    }
}

