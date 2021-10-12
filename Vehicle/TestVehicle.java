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
//Kelas Publik TestVehicle
public class TestVehicle {
    //Fungsi method main
    public static void main(String[] args) {
        //Inisiasi objek vehicle
        Vehicle vehicle=new Vehicle(50.0);
        
        //Pemanggilan method
        System.out.println("MaxLoad\t:"+vehicle.getMaxLoad()+" kg");
        System.out.println("Load\t:"+vehicle.getLoad()+" kg");
    }
}
