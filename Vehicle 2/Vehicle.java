/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas5_2;

/**
 *
 * @author Joel
 */
//Kelas Publik Vehicle
public class Vehicle {
    //Variabel Private
    private double load=80;
    private double maxLoad;
    
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
    
    //Fungsi Method
    public boolean addBox(double weight){
        //Pengkondisian If-Else
        if(maxLoad-load >= weight){
           //Rumus Total Load
           load=load+weight;
           System.out.println("Selamat, Berat Barang Tidak Melebihi Kapasitas Maksimal");
           //Pemanggilan Output
           System.out.println("Muatan\t:"+load+" kg");
           System.out.println("Berat Barang\t:"+weight+" kg");
           System.out.println("Kapasitas Maksimal\t:"+maxLoad+" kg");
           //Pengembalian nilai True
           return true;
       }
       else{
           //Pemanggilan Output
           System.out.println("Maaf, Berat Barang Melebihi Kapasitas Maksimal! Silahkan Kurangi Barang Terlebih Dahulu");
           System.out.println("Muatan\t:"+load+" kg");
           System.out.println("Berat Barang\t:"+weight+" kg");
           System.out.println("Kapasitas Maksimal\t:"+maxLoad+" kg");
           //Pengembalian nilai False
           return false;
       }
    }
}
