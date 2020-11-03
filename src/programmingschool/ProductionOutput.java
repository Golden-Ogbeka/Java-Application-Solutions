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
public class ProductionOutput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String input=JOptionPane.showInputDialog("Enter the number of production plants: "); //Asks for the number of plants the company has
        int numberOfPlants=Integer.parseInt(input); 
        int [] prodCount=new int[numberOfPlants];       //array to store the production count for each plant
        double [] prodCountScaled=new double[numberOfPlants];  //array  to store the production of each plant in a rounded form
        for (int i= 0; i<numberOfPlants;i++)
        {
            prodCount[i]=Integer.parseInt(JOptionPane.showInputDialog("Enter the production count for plant " + (i+1)));
            //for loop to store the product count that is entered into the array
        }
        for (int i= 0; i<numberOfPlants;i++)
        {
            prodCountScaled[i]= Math.round(prodCount[i]/1000.0);
            //accepts the rounded value for each plant
            prodCountScaled[i]=(int)prodCountScaled[i];
            //transforms each value into an integer
        }
        for(int i=0;i<numberOfPlants;i++)
        {
            //loop for the row
            for(int j=0; j<prodCountScaled[i]; j++)
                //loop for the column
                System.out.print("*");
            System.out.println();
            //after printing for the row and column, then it goes to the next line
        }
    }
    
}
