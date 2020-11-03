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
public class ContinueExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Odd Numbers");
	for(int i =1; i <=10; i++){
	if (i%2 == 0)
	 continue;
	 // rest of the loop body skipped when i is even 
	 System.out.println(i+"\t");
	 }

    }
    
}
