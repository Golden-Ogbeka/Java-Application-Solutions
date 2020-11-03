/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programmingschool;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Nedlog
 */
public class PalindromeAssignment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  
        Scanner instance=new Scanner(System.in);
         System.out.println("Enter the name: ");
         String input=instance.nextLine();
         input=input.toLowerCase();
        String reverse = new String();
        for(int i=(input.length()-1); i>=0;i--)
        {
            reverse+=input.substring(i,i+1);
            //or reverse+=input.charAt(i);
            //because a string is an array of characters
        }
        System.out.println(reverse);
        if(reverse.equals(input))
        {
            System.out.println("string is a palindrome");  
        }
        else
           System.out.println("string is not a palindrome");   
    }
}