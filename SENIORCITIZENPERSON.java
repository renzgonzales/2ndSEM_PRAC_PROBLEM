/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seniorcitizenperson;

import javax.swing.JOptionPane;
/**
 *
 * @author User
 */
public class SENIORCITIZENPERSON {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        String name = JOptionPane.showInputDialog("Enter name:");
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter age:"));
        
        VALIDATION_RAW person = new VALIDATION_RAW(name, age);
        person.isAdult();
        
    }
    
}
