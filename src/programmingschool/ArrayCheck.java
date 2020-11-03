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
public class ArrayCheck {
    public static void main(String[] args) {
        int lenght=Integer.parseInt(JOptionPane.showInputDialog("Enter the lenght of the array: "));
        int [] arr=new int[lenght];
        for(int i=0; i<lenght;i++){
            arr[i]=Integer.parseInt(JOptionPane.showInputDialog("Enter the value in index: "+i));   
        }
        int j=0;
        for (int i=0;i<lenght;i++){
            if(arr[i]==2){
                j=j+1;
            }
            else
                continue;
        }
        if(j==0)
            JOptionPane.showMessageDialog(null, "There is no 2 in the array");
        else if(j==1)
            JOptionPane.showMessageDialog(null, "There are only a single ("+j+") 2 in the array");
        else
            JOptionPane.showMessageDialog(null, "There are "+j+" 2's in the array");
    }
}
