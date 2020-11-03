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
public class SearchArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] arr= {1,2,3,4,7,8,9,5};
        String num= JOptionPane.showInputDialog("Enter a value");
        int number=Integer.parseInt(num);
        int j=0;
        for (int i=0; i<arr.length;i++)
        { 
            if(number==arr[i])
            {
                j=i;
                break;
            }
            else
                j=-1;
            
            }
        if(j==-1) 
            JOptionPane.showMessageDialog(null, "It is not in the array");
        else
            JOptionPane.showMessageDialog(null, "It is in the array and in index: " + j);
       
    }
    
}
