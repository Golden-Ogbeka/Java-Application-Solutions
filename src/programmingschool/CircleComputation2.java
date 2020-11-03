/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programmingschool;

import java.util.Scanner;

/**
 *
 * @author Nedlog
 */
public class CircleComputation2 {
    public static void main(String[] args) {
        Scanner sca=new Scanner(System.in);
        System.out.println("Enter the radius: ");
        double radius=sca.nextDouble();
        double area=0.0;
        double circumference=0.0;
        area= Math.PI*radius*radius;
            circumference=2*Math.PI*radius;
            System.out.println("The area is: "+ area);
            System.out.println("The circumference is: "+ circumference);
        while(radius!=-1){
            System.out.println("Enter the radius: ");
            radius=sca.nextDouble();
            area= Math.PI*radius*radius;
            circumference=2*Math.PI*radius;
            System.out.println("The area is: "+ area);
            System.out.println("The circumference is: "+ circumference);
        
        }
       
    }}
