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
public class RectangleDemo {
    public static void main(String[] args)
    {
        Rectangle r1=new Rectangle();
        r1.length=10;
        System.out.println("Before Function Length: " + r1.length);
        
        r1.setLength(20);
        System.out.println("After Function Length: " + r1.length);
    }
    
}
