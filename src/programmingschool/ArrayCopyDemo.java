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
public class ArrayCopyDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char [] copyFrom ={'d','e','c','a','f','f','e','i','n','e','a','g','g'};
        char[] copyTo=new char[7];
        System.arraycopy(copyFrom, 2, copyTo, 0, 7);
        
        System.out.println(new String(copyTo));//TO convert the array of characters into string
    }
    
}
