/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas5_1;

/**
 *
 * @author Joel
 */
//Kelas Publik Vehicle
public class Vehicle {
    //Variabel Private
    public double load=12.15;
    public double maxLoad;
    
    //Fungsi Konstruktor Vehicle
    public Vehicle(double max_Load){
        this.maxLoad=max_Load;
    }
    
    //Fungsi Method
    public double getLoad(){
        return load;
    }
    public double getMaxLoad(){
        return maxLoad;
    }
    
    //Fungsi Konstruktor setMaxLoad
    public void setMaxLoad(double maxLoad){
        this.maxLoad=maxLoad;
    }
    
    
}
