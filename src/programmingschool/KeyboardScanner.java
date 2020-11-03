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
public class KeyboardScanner {
    public static void main(String[] args) {
        Scanner sca=new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int integer=sca.nextInt();
        System.out.println("Enter a floating point number: ");
        double point=sca.nextDouble();
        System.out.println("Enter your name: ");
        String name=sca.next();
        System.out.println("Hi! "+name+" , the sum of "+integer +" and "+point+" is "+(integer+point));
    }
    
}
