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
public class InitializingArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic her
        int [][] my_array=new int[4][4];
        int index1,index2;
        for(index1=0;index1<4;index1++)
            for(index2=0;index2<4;index2++)
                my_array[index1][index2]=index2;
        for(index1=0;index1<4;index1++)
        {
            for(index2=0;index2<4;index2++)
                System.out.print(my_array[index1][index2]);
            System.out.println();
        }
    }
    
}
