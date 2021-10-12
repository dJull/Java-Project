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
public class Cat extends Animal implements Pet{
    public String name;
    
    public Cat(){
        
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name=name;
    }
    
    public void play(){
        System.out.println("Kucing Dapat Bermain");
    }
    
    public void eat(){
        System.out.println("Kucing Dapat Makan");
    }
    
    public void displayName(){
        System.out.println("\nNama Kucing\t:"+name);
    }
    
}
