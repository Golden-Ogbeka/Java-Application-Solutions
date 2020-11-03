/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programmingschool;
import javax.swing.JOptionPane;
/**
 *
 * @author Nedlog
 */
public class ShapeAreas {
    float areaRectangle(){
        float l= Integer.parseInt(JOptionPane.showInputDialog("Enter the lenght: "));
        float b= Integer.parseInt(JOptionPane.showInputDialog("Enter the breadth: "));
        float area=l*b;
        return area;
    }
    double areaCircle(){
        double pi=3.14;
        double r= Integer.parseInt(JOptionPane.showInputDialog("Enter the raius: "));
        double area=pi*r*r;
        return area;
    }
    double areaTriangle(){
        float h= Integer.parseInt(JOptionPane.showInputDialog("Enter the height: "));
        float b= Integer.parseInt(JOptionPane.showInputDialog("Enter the base: "));
        double area=0.5*b*h;
        return area;
    }
    
}
