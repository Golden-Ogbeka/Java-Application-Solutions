/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programmingschool;
import java.util.Scanner;
//classes are represented with first letters being capital and objects' first letter is small
/**
 *
 * @author Nedlog
 */
public class EvenOrOdd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        //Get input from user
        System.out.println("Enter a number: ");
        int number=input.nextInt();
        if(number%2==0)
        {
            System.out.println("The number is even");
        }
        else
            System.out.println("The number is odd");
        /*
        Determinr if it is divisible by two. If yes, then it is even
        otherwise it is odd
        */
        
        //Output the result
    }
    
}
