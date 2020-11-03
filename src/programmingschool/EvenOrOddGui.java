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
public class EvenOrOddGui {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String strNumber = JOptionPane.showInputDialog("Enter a number");//Input would be taken as a strings
        int number=Integer.parseInt(strNumber);
        if(number %2 ==0)
            JOptionPane.showMessageDialog(null, "The number is even");
        //null is just to fulfill all parameters
        //show message dialog is for output
        else
            JOptionPane.showMessageDialog(null, "The number is odd");
    }
    
}
