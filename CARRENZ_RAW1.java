/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrenz;
import javax.swing.JOptionPane;
/**
 *
 * @author User
 */
public class CARRENZ_RAW1 {
    
    private String make;
    private String model;
    int year;
    
    CARRENZ_RAW1(String make,String model,int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }
    public void PrintDetails(){
       JOptionPane.showMessageDialog(null,"Car Details: \nMake:  " + make + "\nModel : " + model + "\nYear : " + year);
        
        
    }
}
