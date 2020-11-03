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
public class DoWhileLoopDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int count =1;
	System.out.println("Printing numbers from 1 to 10");
	do{
	 System.out.println(count++);
	 }
        while (count <=10);
    }
    
}
