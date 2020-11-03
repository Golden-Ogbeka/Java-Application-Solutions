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
public class PalindromeAssignmentGUI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String original_str,reversed_str=new String();
        original_str=JOptionPane.showInputDialog("Please enter a string");
        //for the reverse
        for(int i=original_str.length()-1;i>=0;i--)
        {
            reversed_str=reversed_str + original_str.charAt(i);
        }
        JOptionPane.showMessageDialog(null, "Te reverse is: " + reversed_str);
        if(original_str.equals(reversed_str))
            JOptionPane.showMessageDialog(null, "String is a palindrome");
        else
            JOptionPane.showMessageDialog(null, "String is a not palindrome");
    }
    
    
}
