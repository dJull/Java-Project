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
//Kelas Publik TestVehicle
public class TestVehicle {
    //Fungsi method main
    public static void main(String[] args) {
        //Inisiasi objek vehicle
        Vehicle vehicle=new Vehicle(250);
        
        //Pemanggilan method
        vehicle.getLoad();
        vehicle.getMaxLoad();
        vehicle.addBox(65.10);
        vehicle.addBox(125.0);
    }
}
