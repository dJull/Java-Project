/**
 * @(#)Company.java
 *
 *
 * @author 
 * @version 1.00 2020/9/30
 */
import java.util.*;

public class Company{
	private static Company company_instance=null;
	private String name= "Joel Rayapoh Damanik";
	private List vehicles=new ArrayList();
	
	public void getName(){
		System.out.println("Nama\t:"+name);
	}
	
	public void getVehicles(){
		vehicles.add("Motor");
		vehicles.add("Mobil");
		vehicles.add("Kereta Api");
		System.out.println("Vehicles\t:"+vehicles);	
	}
	
	public static Company getCompany() 
    { 
        // To ensure only one instance is created 
        if (company_instance == null) 
        { 
            company_instance = new Company(); 
        } 
        return company_instance; 
    } 
	
}
