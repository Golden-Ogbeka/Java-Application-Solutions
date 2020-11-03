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
public class ExtractDigits {
    public static void main(String[] args) {
        int digits;
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter an integer: ");
        digits=inp.nextInt();
        int container=0;
        //to hold each digit
        System.out.println("The inverse is: ");
        String digit =digits+"";
        //this converts digits to a string so that you can use the length
        for(int i=1;i<=digit.length();i++)
        {
            container=digits%10;
            //this extracts the least significant digit
            System.out.print(""+container);
            System.out.print(" ");
            digits=digits/10;     
            //this removes the least significant digit
            }
        }
        
    }


