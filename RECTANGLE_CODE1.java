/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangle_code1;
import javax.swing.JOptionPane;
//import java.util.Scanner;

/**
 *
 * @author User
 */
public class RECTANGLE_CODE1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String inputWidth = JOptionPane.showInputDialog(null, "enter width choi: ");
        double width = Double.parseDouble(inputWidth);
        
        String inputHeight = JOptionPane.showInputDialog(null, "enter height mega: ");
        double height = Double.parseDouble(inputHeight);
        
        RECTEANGLE_RAW wrecktangle = new RECTEANGLE_RAW(width,height);
        double area = wrecktangle.getArea();
        
        JOptionPane.showMessageDialog(null,"AREA SA IMONG RECTANGLE BOANG: " + area);
        
        JOptionPane.showMessageDialog(null,"SALAMAT HA!!");
        
        
    }
}
