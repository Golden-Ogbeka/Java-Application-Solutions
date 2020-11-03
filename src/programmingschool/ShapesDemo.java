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
public class ShapesDemo {
    public static void main(String[] args) {
        double area;
        String shape;
        shape=JOptionPane.showInputDialog("Enter the shape you want to find the area between Rectangle, Circle and Triangle");
        ShapeAreas obj=new ShapeAreas();
        if(shape.equalsIgnoreCase("Triangle")){
            area=obj.areaTriangle();
            JOptionPane.showMessageDialog(null,"The area of the Triangle is: " + area);
        }
        else if(shape.equalsIgnoreCase("Rectangle")){
            area=obj.areaRectangle();
            JOptionPane.showMessageDialog(null,"The area of the Rectangle is: " + area);
        }
        else {
            area=obj.areaCircle();
            JOptionPane.showMessageDialog(null,"The area of the Circle is: " + area);
        }
    }
    
}
