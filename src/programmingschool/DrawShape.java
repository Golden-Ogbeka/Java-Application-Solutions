/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programmingschool;

/**
 *
 * @author Nedlog
 */
public class DrawShape {
    static void draw(Shape s){
        System.out.println("Drawing "+ s);
        
    }
    public static void main(String[] args) {
        Shape t = new Triangle();
        //or Trinagle t=new Triangle();
        //because Triangle is still under Shapes
        draw (t);
        //Combines the "Drawing with the output in Triangle"
        Shape m= new Shape();
        draw(m);
        //this would combine Drawing with the output in Shape
        Shape v=t;
        //This is stored in Shape but the method in shape is overridden already by Triangle
        //This is polymorphism
        draw(v);
        
    }
}
