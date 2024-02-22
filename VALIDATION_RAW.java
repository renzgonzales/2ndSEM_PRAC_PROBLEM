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
public class VALIDATION_RAW {
    
    private String name;
    int age;
    
    VALIDATION_RAW(String name,int age){
        this.name = name;
        this.age = age;
    }
    public void isAdult(){
        if (age >= 18 && age<60){
        JOptionPane.showMessageDialog(null,name + "\nIs an adult");
    }else if (age>= 60){
        JOptionPane.showMessageDialog(null,name + " \nIs a senior citizen");
    }else{
        JOptionPane.showMessageDialog(null,name + "\nIs not an adult");
    }
        JOptionPane.showMessageDialog(null,"VALIDATION COMPLETE CLICK" + "\nOK");
    }
}
