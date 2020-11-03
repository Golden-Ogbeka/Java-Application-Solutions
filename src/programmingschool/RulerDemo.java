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
public class RulerDemo {
    public static void myMethod(Ruler r){
        r.lenght=5;
        r.breadth=6;
        System.out.println("The lenght is: "+ r.lenght);
        System.out.println("The breadth is: "+ r.breadth);
    }
    public static void main(String[] args) {
        Ruler r=new Ruler();
        myMethod(r);
        /*
        RulerDemo z=new RulerDemo();
        Ruler m=new Ruler();
        z.myMethod(m); //if the method in the class is not static
       */         
    }
    
}
