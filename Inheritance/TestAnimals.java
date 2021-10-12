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
public class TestAnimals {
    public static void main(String[] args) {
        Spider spider=new Spider();
        spider.eat();
        
        Cat cat=new Cat();
        cat.setName("Kozhi");
        cat.getName();
        cat.displayName();
        cat.play();
        cat.eat();
        
        Fish fish=new Fish();
        fish.setName("Zishi");
        fish.getName();
        fish.displayName();
        fish.play();
        fish.walk();
        fish.eat();
        
    }
}
