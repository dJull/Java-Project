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
public class Fish extends Animal implements Pet{
    public String name;
    
    public Fish(){
        
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name=name;
    }
    
    public void play(){
        System.out.println("Ikan Dapat Bermain");
    }
    
    public void walk(){
//        super.walk();
        System.out.println("Tetapi Ikan Tidak Dapat Berjalan, dan Tidak Mempunyai kaki");
    }
    
//    public void eat(){
//        System.out.println("Ikan Dapat Makan");
//    }
    
    public void displayName(){
        System.out.println("\nNama Ikan\t:"+name);
    }
}
